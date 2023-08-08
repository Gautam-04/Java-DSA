package Basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        //if structure
        if(a == 5){
            System.out.println("Hola");
        }
        //If else structure
        if(a == 10){
            System.out.println("Hello world");
        } else{
            System.out.println("The value did not match");
        }
        //while loops
        int count = 1;
        while(count <= 5){
            System.out.println(count);
            count++;
        }
        //for loops
        for (count=1;count<=5;count++){
            System.out.println(count);
        }

    }
}
