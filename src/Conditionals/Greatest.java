package Conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number you want to compare: ");
        int N1 = input.nextInt();
        int N2 = input.nextInt();
        int N3 = input.nextInt();

        if(N1 > N2 && N1 > N3){
            System.out.println(N1 + " Is the greatest number");
        } else if (N2 > N3) {
            System.out.println(N2 + " Is the greatest number");
        } else {
            System.out.println(N3 + " Is the greatest number");
        }

        int max = Math.max(N3 ,Math.max(N1 , N2) );
        System.out.println(max);
    }
}
