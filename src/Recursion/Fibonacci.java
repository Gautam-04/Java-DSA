package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number till where you want fibonacci:- ");
        int n = in.nextInt();
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }

        return  fibo(n - 1) + fibo(n - 2);
    }
}
