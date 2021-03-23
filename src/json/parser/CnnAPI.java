package json.parser;

import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.util.ArrayList;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.


 */

        public static void main(String[] args) {
            System.out.println("### NewsScript! v1.0: Get Daily News ###");
            String API_KEY = "84acbdbfdf734ff1bfba06430a0eb143";

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(String.format("https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=%s", API_KEY)))
                    .GET()
                    .build();

            try {
                HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());  //storing response converted into string by Body.Handlers
                System.out.println(response.body());

                NewsDTO obj = new Gson().fromJson(response.body(), NewsDTO.class);

                System.out.println(obj.articles);

                for (ArticleDTO art : obj.articles) {
                    System.out.println("### " + art.title + " ### \n");
                    System.out.println(art.description);
                    System.out.println("\nPublished by: " + art.author + " " + art.publishedAt);
                    System.out.println("\nCheck out the photos here: " + art.urlToImage);
                    System.out.println("\nRead more: " + art.url + "\n");

//                ConnectToSqlDB connect = new ConnectToSqlDB();
//                connect.insertDataFromIntegerArrayListToSqlTable1(obj.articles, "cnn_news", "articles" );
                }

//t("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public class NewsDTO {
            String status;
            int totalResults;
            ArrayList<ArticleDTO> articles;
        }

        public class ArticleDTO {
            SourceDTO source;
            String author;
            String title;
            public String description;
            String url;
            String urlToImage;
            String publishedAt;
        }


        public class SourceDTO {
            String id;
            String name;
        }
    }

