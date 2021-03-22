package math.problems;

import java.util.ArrayList;
import java.util.List;

import databases.ConnectToSqlDB;

public class LowestNumber {

    public static void main(String[] args) {
        /*
         Write a method to find the lowest number from this array.
         */

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};


        //find lowest number from the array
        LowestNumber.findLowestNumber(array);


        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> lowestValue = new ArrayList<String>();
        try {
            connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
            lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
        for(String st:lowestValue){
            System.out.println(st);
        }
    }

    /**
     * This method finds the lowest number from the given array
     * @param num
     * @return
     */
    public static int findLowestNumber(int[] num) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("The lowest number is: " + min);
        return min;
    }

}



