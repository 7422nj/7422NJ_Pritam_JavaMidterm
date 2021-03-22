package math.problems;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter max number: ");

        String input = scanner.nextLine();
        int maxNumber = Integer.parseInt(input);

        System.out.println("List of Prime Numbers Between 2 and " + maxNumber);

        for (int num = 2; num <= maxNumber; num++) {
            boolean Prime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    Prime = false;
                    break;
                }
            }

            if (Prime == true) {
                System.out.println(num);

            }
        }
    }
}
