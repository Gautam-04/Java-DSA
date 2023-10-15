package OOPs;

public class Question27 {
    //Create a class hierarchy for different types of "Animals" (e.g., "Dog," "Cat," "Bird"). Implement a method "feed()" in each class.
    // Create an array of Animals and demonstrate polymorphism by calling the "feed()" method on each element in the array.
    public static void main(String[] args) {
        Animal[] animals = new Animal[1];
        animals[0] = new Dog("Buddy ");


        for (Animal animal : animals) {
            if (animal != null) {
                animal.feed(); // Demonstrating polymorphism
            }
        }
    }
}

class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }
    public void feed(){};
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void feed(){
        System.out.println(name + "is being feed");
    }
}
