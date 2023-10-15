package OOPs;

public class Question9 {
//    Write a Java program to create an interface Shape with the getArea() method.
//    Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
//    Implement the getArea() method for each of the three classes.

    public static void main(String[] args) {
        int len = 3, breadth = 5;
        RecT rec = new RecT(len,breadth);
double y = rec.getArea();
        System.out.println(y);
Cir cir = new Cir(4);
        System.out.println(cir.getArea());
Square square = new Square(4);
        System.out.println(square.getArea());

    }
}

interface ShapeInt{
     double getArea();
}

class RecT implements ShapeInt{
private double length;
private double breadth;

public RecT(double length, double breadth){
    this.length = length;
    this.breadth = breadth;
}
    @Override
    public double getArea() {
return length * breadth;
    }
}

class Cir implements ShapeInt{
    private double radius;

    public Cir(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return (3.14 * radius * radius);
    }
}

class Square implements ShapeInt{
    private double side;

    public Square(double side){
        this.side = side;
    }


    @Override
    public double getArea() {
        return (side * side);
    }
}