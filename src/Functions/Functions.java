package Functions;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to check Prime");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int a){
        if (a <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= a){
            if(a%c == 0){
                return false;
            }
            c++;
        }
        return c * c > a;
    }
}
