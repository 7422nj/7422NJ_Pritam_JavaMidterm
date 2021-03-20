package math.problems;

import java.util.Scanner;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        int n,mul;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        n = s.nextInt();
        Factorial obj = new Factorial();
        mul = obj.factorial(n);
        System.out.println("Factorial of "+n+" :"+mul);
    }
    static int factorial(int x)
    {
        if(x > 1)
        {
            return(x * factorial(x - 1));
        }
        return 1;
    }
}


