package OOPs;

public class Question20 {
//    Write a Java program to create a method that takes an integer
//    as a parameter and throws an exception if the number is odd.
    public static void main(String[] args) {
int num = 7;

try{
checkNumber(num);
    System.out.println("The number is even");

}catch (RuntimeException e){
    System.out.println(e.getMessage());
}
    }

        public static void checkNumber(int number) {
            if (number % 2 != 0) {
                throw new RuntimeException("The number is odd.");
            }
        }

}


