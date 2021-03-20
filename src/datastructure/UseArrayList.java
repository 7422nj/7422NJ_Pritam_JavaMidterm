package datastructure;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        //Made an arrayList of String with reference name list
        ArrayList<String> list = new ArrayList<>();

        //How to add to arrayList
        list.add("Be"); //index 0
        list.add("The");  //index 1
        list.add("Change"); //index 2
        list.add("That"); //index 3
        list.add("You"); //index 4
        list.add("Wish"); //index 5
        list.add("To"); //index 6
        list.add("See"); //index 7
        list.add("In"); //index 8
        list.add("The"); //index9
        list.add("World"); //index 10


        //Displaying the list
        System.out.println("*** The list is : \n *** " + list);

        //Create an iterator for the list
        //By using iterator() method
        Iterator<String> iter = list.iterator();

        //Display the list after iterating through the list
        System.out.println("\nThe iterator values" + " of list are : ");
        {
        }

        while (iter.hasNext()) { //Boolean condtion <- if next string value had defined data return true
            //Helps identify string variables with defined data "what we need"

            //fetch next value until no more data is left to fetch
            System.out.println(iter.next() + " ");
        }
        String arr[] = {" ", " - Mahatma Gandhi - "};
        for (String str : arr) {
            System.out.println(str);
        }
        System.out.println("********************************************************************************************");

        //Removes a word from the list
        list.remove("You");
        System.out.println("After Removal of Word : \n"+list);

        //Show me word in index #3
        //list can you get word in index #3 and show us the name
        System.out.println(list.get(3));

        //.contains() is a boolean method <- return true if the list contains that specific value
        System.out.println(list.contains("George"));

        //The hashCode method is an inbuilt method that returns the integer hashed value of the input value.
        //If two or more objects are equal according to the equals method, then their hashes should be equal too.
        //If two or more objects are not equal according to the equals method, then their hashes can be equal or unequal.
        System.out.println(list.hashCode());

        //Returns Size of the List
        System.out.println(list.size());

        //Return true or false according to list being empty or noot
        System.out.println(list.isEmpty());
    }
}
