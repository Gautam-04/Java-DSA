package Basics;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Temperature in degree celsius: ");
        float temp = input.nextFloat();

       float tempF = (temp * 9/5) + 32;
        System.out.println(tempF);

    }
}
