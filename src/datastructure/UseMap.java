package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        HashMap<String, Integer> cityAndZipOfUSA = new HashMap<>();
        cityAndZipOfUSA.put("NJ", 21121);
        cityAndZipOfUSA.put("PA", 21343);
        cityAndZipOfUSA.put("VA", 32112);

        System.out.println(cityAndZipOfUSA.containsKey("NJ"));  //true
        System.out.println(cityAndZipOfUSA.containsValue("NJ")); //false
        System.out.println(cityAndZipOfUSA.containsValue(21121));  //true

        HashMap<String, Integer> cityAndZipOfCanada = new HashMap<>();
        cityAndZipOfCanada.put("CT", 2165);
        cityAndZipOfCanada.put("DHK", 4356);
        System.out.println(cityAndZipOfCanada.containsKey("CT"));
        System.out.println(cityAndZipOfCanada.containsKey("DK"));
        System.out.println(cityAndZipOfCanada.containsValue(2131));
        System.out.println(cityAndZipOfCanada.containsValue(3121));

        HashMap<String, HashMap<String, Integer>> map = new HashMap();
        map.put("USA", cityAndZipOfUSA);
        map.put("Bangladesh", cityAndZipOfCanada);
        System.out.println(map);

        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
        list.add(cityAndZipOfCanada);
        list.add(cityAndZipOfUSA);
        System.out.println(list);

        List<String> food = new ArrayList<>();
        food.add("Biryani");
        food.add("Mutton Kacche Biryani");

        List<String> drink = new ArrayList<>();
        drink.add("Pepsi");
        drink.add("Lemonade");

        List<String> foodAndDrink = new ArrayList<>();
        foodAndDrink.add("Best  of Food");
        foodAndDrink.add("Best  of Drinks");

        Map<String, List<String>> things = new HashMap<>();
        things.put("My Favorite Food is: ", food);
        things.put("My Favorite Drink is: ", drink);
        System.out.println(things);
    }

}

