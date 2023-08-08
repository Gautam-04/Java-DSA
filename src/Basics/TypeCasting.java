package Basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        //typecasting
        int value = (int)(56.96f);
        System.out.println(value);

//        automatic type promotion in expressions
//       int a = 257;
//        byte b = (byte)(a);  (257%256 = 1)
//        System.out.println(b);

        //example of
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = 0.1245;
    double result = (f * b) + (i / c) -(d - s);
        System.out.println((f * b) + " " + (i / c)+ " " + (d - s));
        System.out.println(result);
    }
}
