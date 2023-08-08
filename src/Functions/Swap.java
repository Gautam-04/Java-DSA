package Functions;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = in.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = in.nextInt();
        System.out.println("Number Before swapping are " + a + " " + b);
        swap(a,b);
    }
    static void swap(int c, int d){
        int temp;
        temp = c;
        c = d;
        d = temp;
        System.out.println("Swapped digits are :- " + c + " " +  d);
    }
}
