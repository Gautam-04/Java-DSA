package OOPs;

public class Question2 {
//    Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//    creating a class named 'Triangle' without any parameter in its constructor.
public static void main(String[] args) {

    double side1 = 3;
    double side2 = 4;
    double side3 = 5;

Triangle triangle = new Triangle();
double perimeter = triangle.getPerimeter(side1,side2,side3);

double area = triangle.getArea(side1,side2,side3);

    System.out.println(perimeter);
    System.out.println(area);
}
}

class Triangle{


 public double getPerimeter(double side1,
    double side2,
    double side3){
     return side1+side2+side3;
 }

 public double getArea(double side1,
                       double side2,
                       double side3){
     double s = (side1 + side2 + side3) / 2;
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }
}
