package datastructure;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

    public static void main(String[] args) throws IOException {
        /*
         * Create an API to read the below textFile and print it to the console.
         *      HINT: Use BufferedReader class
         * Use try-catch block to handle Exceptions
         *
         * Store and retrieve the file to/from a database table.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack using push, peek, search & pop methods.
         * Use For-Each & While-loop with Iterator to retrieve data.
         */

        //Third Approach -> More Approaches Down Below


        //Dynamic Approach
        String selfDrivingCar = "src/data/self-driving-car";

//            //FileReader Fetches/Handles Files in Java
        try (FileReader fr = new FileReader(selfDrivingCar)) { //fileName=Path of file

            //Java BufferedReader class is used to read the text from a character-based input stream.
            //It can be used to read data line by line by readLine() method.
            //It makes the performance fast.
            //It inherits Reader class.
            BufferedReader br = new BufferedReader(fr);

            //The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList .
            Stack<String> list = new Stack<String>();
//            LinkedList<String> ist = new LinkedList<String>(); //create linkedList
            Iterator<String> ite = list.iterator();
             int i = 0; //empty int variable

                //if condition is true
                while (true) {

                    //if bufferedReader is able to find data in text file than it will send data to String TextFile
                    String TextFile = br.readLine();

                    //if the String TextFile is empty/null
                    if (TextFile == null)

                        //than the break loop or switch statement
                        break;

                    //if there is data in String TextFile than add a number into int i -> 1,2,3,4,5,6
                    i++;//adds one for the loop

                    //add all data in linkedList to stack
//                    list.addAll(ist);

                    //add textFile  data to stack
                    list.add(TextFile);
                    System.out.println(MessageFormat.format("{101}  \n{0}", list));
                }
                //close bufferReader
                br.close();

            //catch exception inCase error occurs
        } catch (IOException e) {
            e.printStackTrace(); //<- gives throwable as well as shows line and class or method of error
            System.out.print("\n*** Reading Unsuccessful ***");
        }

    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//First Approach

//		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
//		FileReader fileReader = null;
//		BufferedReader bufferedReader = null;
//		String filePath = "src/data/self-driving-car";
//		try {
//			fileReader = new FileReader(filePath);
//			bufferedReader = new BufferedReader(fileReader);
//			String data;
//			while ((data = bufferedReader.readLine()) != null) {
//				System.out.println(data);
//			}
//		} catch (Exception e) {
//
//
//
//			System.out.println("Exception not found");
//		} finally {
//			try {
//				fileReader.close();
//				bufferedReader.close();
//			} catch (Exception e) {
//				System.out.println("Closed file");
//			}
//		}
//


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Second Approach

//    //Dynamic Approach
//    String selfDrivingCar = "src/data/self-driving-car";
//
////            //FileReader Fetches/Handles Files in Java
//		try (FileReader fr = new FileReader(selfDrivingCar)) { //fileName=Path of file
//
//                //Java BufferedReader class is used to read the text from a character-based input stream.
//                //It can be used to read data line by line by readLine() method.
//                //It makes the performance fast.
//                //It inherits Reader class.
//                BufferedReader br = new BufferedReader(fr);
//
//                //The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList .
//                LinkedList<String> List = new LinkedList<String>();
//
//        int i=0; //empty int variable
//
//        //if bufferedReader finds text in our textFile, send text to int i or else return -1/null
//        while(true){
//        String TextFile = br.readLine();
//        if(TextFile == null)
//        break;
//        i++;//adds one for the loop
//        System.out.println(i + " : " + TextFile);
//        }
//        //print data from int i
//        System.out.print(i);
//        System.out.print("\n*** Reading Successful ***");
//
//        //close bufferReader
//        br.close();
//
//        //catch exception inCase error occurs
//        } catch (IOException e) {
//        e.printStackTrace(); //<- gives throwable as well as shows line and class or method of error
//        System.out.print("\n*** Reading Unsuccessful ***");
//        }
//        }
//        }
