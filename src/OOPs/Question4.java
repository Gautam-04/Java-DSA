package OOPs;

import java.util.Scanner;

public class Question4 {
//    Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its
//    constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of the rectangle are entered through the keyboard.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rec rec  = new Rec();

        float len = in.nextFloat();
        float breadth = in.nextFloat();

        float area = rec.Area(len,breadth);
        System.out.println(area);
    }

}

class Rec{
    public float Area(float l, float b){
        return l * b;
    }
}