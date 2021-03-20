package string.problems;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */

        //question for entry
        System.out.print("Enter word of choice: ");

        //imported scanner
        Scanner in = new Scanner(System.in); //<- enter into the scanner system

        //Original string
        String origString = in.nextLine(); //<- It will check our input and covert it to a string
        int length = origString.length(); // <- will look at the length of the string

        boolean isPalindrome = true; //declare and assign boolean

        for(int beginIndex = 0; beginIndex < length; beginIndex++) //
        {
            if(origString.charAt(beginIndex) != origString.charAt(length-1-beginIndex)) {
                System.out.println("Word entered is not a Palindrome.");
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Word you entered is a Palindrome.");
        }
    }}

