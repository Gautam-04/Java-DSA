package OOPs;

public class Question29 {
//   Write a Java program that attempts to divide a number by zero inside a try-catch block.
//   Handle the exception and print an error message.
    public static void main(String[] args) {
int num = 9;
try{
int result = num/0;
    System.out.println(result);
}catch (ArithmeticException e){
    System.err.println("Number cannot b divide by zero");
}
    }
}
