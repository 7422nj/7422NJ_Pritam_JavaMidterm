package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    public static void main(String[] args) throws FileNotFoundException {
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

            //Dynamic Approach
            String selfDrivingCar = "src/data/self-driving-car";

            //FileReader Fetches/Handles Files in Java
            try(FileReader fr = new FileReader(selfDrivingCar)) { //fileName=Path of file

            //Java BufferedReader class is used to read the text from a character-based input stream.
            //It can be used to read data line by line by readLine() method.
            //It makes the performance fast.
            //It inherits Reader class.
            BufferedReader br = new BufferedReader(fr);

            int i; //empty int variable

            //if bufferedReader finds text in our textFile, send text to int i or else return -1/null
            while ((i = br.read()) != -1)

                //print data from int i in char value
                System.out.print((char)i);
            System.out.println("\n *** Reading Successful *** ");

            //close bufferReader
            br.close();

            //catch exception incase error occurs
        }catch (IOException e){
            e.printStackTrace(); //<- gives throwable as well as shows line and class or method of error
            System.out.println("\n *** Reading Unsuccessful *** ");
        }




    }

}
