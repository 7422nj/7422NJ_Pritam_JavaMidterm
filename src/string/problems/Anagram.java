package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First String : ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second String : ");
        String s2 = scanner.nextLine();
        if(checkAnagram(s1, s2))
            System.out.println(s1+" and "+s2+" are Anagrams");
        else
            System.out.println(s1+" and "+s2+" are NOT Anagrams");
        scanner.close();
    }

    public static boolean checkAnagram(String s1, String s2) {

        if(s1.length() != s2.length())
            return false;
        else
        {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return (Arrays.equals(arr1, arr2));
        }



    }


}


