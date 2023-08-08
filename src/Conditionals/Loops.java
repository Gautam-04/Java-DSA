package Conditionals;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        //Q: Print number 5 timed.
        for (i=1;i<=5;i++){
            System.out.println("Hello World");
        }

        int n = input.nextInt();
        for (i = 1; i<=n; i++) {
            System.out.println(i +" ");
        }

        //while loop
        int num=1;
        while(num<=5){
            System.out.println(num);
            num+=1;
        }

        //do while loop
        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while(a <= 5);

    }
}
