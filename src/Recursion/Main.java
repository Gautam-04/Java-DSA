package Recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//write a function that prints Hello World
        Recursion();
    }
    static  void  Recursion(){
        System.out.println("Hello world");
        Recursion();
    }
}
