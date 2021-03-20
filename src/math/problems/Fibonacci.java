package math.problems;

import java.util.Scanner;

public class Fibonacci {

    static int n, a=0, b=0, c=1;
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Amount of Numbers to Display: ");
        n = s.nextInt();
        System.out.println("Fibonacci Series of 40 Numbers: ");
        for (int i=1; i<=n; i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.println(a+" ");




        }}


    public static int fibonacci(int i) {
        return a;
    }
}
