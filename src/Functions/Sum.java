package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        q: take the input of 2 numbers and print the sum
//         int num1 , num2 , result;
//        System.out.println("Enter first number");
//        num1 = in.nextInt();
//        System.out.println("Enter 2nd number:");
//        num2 = in.nextInt();
//        result = num1 + num2;
//        System.out.println("The sum is: " + result);
sum();
int ans = sum2();
        System.out.println(ans);
    }

  static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
       int num1 = in.nextInt();
       System.out.println("Enter 2nd number:");
      int num2 = in.nextInt();
      int result = num1 + num2;
       System.out.println("The sum is: " + result);
    }

    static  int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = in.nextInt();

        int b=        num1 + num2;
     return b;
    }

    /*

     access modifier (we'll look in oop) return type name()
{
//body
return statement;
}
    */
}
