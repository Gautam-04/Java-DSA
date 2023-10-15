package OOPs;

public class Question22 {
//    Create a class "MathOperations" with overloaded methods for addition (int, double, and float).
//    Demonstrate how method overloading works in Java.

    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(8,95,1));
        System.out.println(mo.add(3.14f,6.5124f,3.2145f));
        System.out.println(mo.add(64141, 1489411651,16554484));
    }
}

class MathOperation{
    public int add(int x,int y, int z){
        return x+y+z;
    }

    public float add(float x,float y, float z){
        return x+y+z;
    }

    public double add(double x, double y, double z){
        return x+y+z;
    }
}