package OOPs;

public class Question26 {
//    Create two interfaces, "Flyable" and "Swimmable." Implement these interfaces in a class called "Bird."
//    Demonstrate how a class can inherit from multiple interfaces in Java.

    public static void main(String[] args) {
Bird bird = new Bird("Hello");
bird.fly();
bird.swim();

    }
}

interface Flyable {
    void fly();
}

// Swimmable interface
interface Swimmable {
    void swim();
}

class Bird implements  Flyable,Swimmable{
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("The bird can fly");
    }

    @Override
    public void swim() {
        System.out.println("The brid can swim");
    }
}