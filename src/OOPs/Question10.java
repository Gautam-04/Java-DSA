package OOPs;

public class Question10 {
//    Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void.
//    Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and
//    override the draw() method to draw their respective shapes
    public static void main(String[] args) {
Rectang rec = new Rectang(3,4);
rec.draw();
    }
}

interface Drawable{
    void draw();
}

class Rectang implements Drawable{
    public double len;
    public double breath;

    public Rectang( double len, double breath){
        this.len = len;
        this.breath = breath;
    }

    @Override
    public void draw() {
        System.out.println("The is a Rectangle of Length " + len + " and breadth " + breath);
    }
}
