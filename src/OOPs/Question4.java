package OOPs;

import java.util.Scanner;

public class Question4 {
//    Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its
//    constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of the rectangle are entered through the keyboard.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        float len = in.nextFloat();
        float breadth = in.nextFloat();
        Rec rec  = new Rec(len,breadth);
        double area = rec.Area();
        System.out.println(area);
    }

}

class Rec{
    double len;
    double breadth;
    public Rec(double len,double breadth){
        this.len = len;
        this.breadth=breadth;
    }
    public double Area(){
        return (len * breadth);
    }
}