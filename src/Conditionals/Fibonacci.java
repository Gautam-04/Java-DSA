package Conditionals;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 2;

        while(c <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            c++;
        }



        System.out.println(b);
    }
}
