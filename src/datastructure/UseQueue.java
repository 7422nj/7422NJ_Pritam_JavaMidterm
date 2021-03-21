package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        //We cannot creates of a Queue since it's an interface, thus we
        Queue<String> pizza = new LinkedList<>();

        //How to add to a list or queue -> referenceName.add
        //Add elements to the Queue
        pizza.add("Veggie Pizza"); //->true
        pizza.add("Cheese Pizza"); //->true
        pizza.add("Pepporoni Pizza");//->true
        pizza.add("Buffalo Chicken Pizza");//->true
        pizza.add("Meat Lover's Pizza");//->true
        pizza.add("Ham Pizza");//->
        //->false<- because there is no data so hasNext() will return false

        //Display the queue
        System.out.println("The first queue is : " + pizza);
        System.out.println("*******************************************************");

        //Create an iterator for the queue -> using iterator() method
        Iterator<String> dominos = pizza.iterator();

        //Display the values after iteration -> through the list
        System.out.println("The queue after Iteration : ");

        {
        }
        while (dominos.hasNext()) { //hasNext() return true or false if there is data
            System.out.println(dominos.next());

        }
        String hungry[] = {" Eat ", " Dominos ", " Live ", " Better "}; //Made a 1D array
        for (String fatBaby : hungry) {
            System.out.print(fatBaby);
        }
        {
            System.out.println("*******************************************************");
            pizza.poll();//retrieves and removes head of this queue -> returns null if empty
            System.out.println("\nQueue after poll : "+pizza);
            pizza.remove();//retrieves and removes head of this queue -> throws exception if empty
            System.out.println("\nQueue after remove : "+pizza);
            pizza.peek();//retrieves head of this queue but does not remove -> returns null if empty
            System.out.println("\nPeek method displays : "+pizza.peek());//returns head of queue
            pizza.element();//retrieves head of queue but does not remove -> throws exception if empty
            System.out.println("\nElement method displays : "+pizza.element());
            System.out.println("\nDoes the queue contain this element? "+pizza.contains("Buffalo Chicken Pizza"));//Returns true if this collection contains the specified element.
        }
    }
}
