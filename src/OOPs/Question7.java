package OOPs;

public class Question7 {
//    Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints
//    "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.

    public static void main(String[] args) {
        Method1 a = new Method1();
        Method2 b = new Method2();

        a.message();
        b.message();
    }
}

abstract class Parent{
    public void message(){};

}

 class Method1 extends Parent{
    @Override
    public void message(){
        System.out.println("this is first subclass");
    }
}

class Method2 extends Parent{
@Override
    public void message(){
        System.out.println("THis is second subclass");
    }
}
