package OOPs;

import java.util.Scanner;

public class Question1 {
//    Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
//    First method named as 'setDim' takes length and breadth of the rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
//    Length and breadth of rectangle are entered through the keyboard.
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a length");
    double len = in.nextInt();

    System.out.println("Enter a breadth");
    double breadth = in.nextInt();

    Area rectangle = new Area();
rectangle.setDim(len,breadth);

double area = rectangle.getArea();
    System.out.println("the result is this " + area + " found this");

}
}

class Area{
    private double len;
    private double breadth;

    public void setDim(double len,double breadth){
        this.len = len;
        this.breadth = breadth;
    }

    public double getArea(){
        return len*breadth;
    }
}

