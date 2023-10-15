package OOPs;

public class Question2 {
//    Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//    creating a class named 'Triangle' without any parameter in its constructor.
public static void main(String[] args) {
Triangle triangle = new Triangle();
double perimeter = triangle.getPerimeter();

double area = triangle.getArea();

    System.out.println(perimeter);
    System.out.println(area);
}
}

class Triangle{
double side1;
double side2;
double side3;
 public Triangle(){
     side1=4;
     side2=6;
     side3=8;
 }

 public double getPerimeter(){
     return side1+side2+side3;
 }

 public double getArea(){
     double s = getPerimeter() / 2;
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }
}
