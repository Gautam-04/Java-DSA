package OOPs;

public class Question8 {
//    We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three
//    abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
//    The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius.
//    Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle,
//    square and circle respectively. Create an object of class 'Area' and call all the three methods.

    public static void main(String[] args) {
        AreaShapes area = new AreaShapes();
        int len = 4, breadth = 5;
        int r = 3;
        int side = 4;

        area.RectangleArea(len,breadth);
        area.CircleArea(3);
        area.SquareArea(4);
    }
}

abstract class Shapes{
    public  void RectangleArea(int len,int breadth){};
    public void CircleArea(int r){};
    public void SquareArea(int side){};

}

class AreaShapes extends Shapes{
    @Override
    public void RectangleArea(int x, int y){
        System.out.println(x*y);
    }

    @Override
    public void CircleArea(int r){
        double area = 3.14 * r * r;
        System.out.println(area);
    }
    @Override
    public void SquareArea(int side){
        System.out.println(side*side);
    }
}
