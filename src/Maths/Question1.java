package Maths;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 67;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
