package Maths;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,1,3,4,6,1,2,3,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr){
        int unique = 0;

        for (int n: arr){
            unique^=n;
        }

        return unique;
    }
}
