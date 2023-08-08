package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    int[][] arr = new int[3][3];
    //input
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0;j < arr.length; j++)
                arr[i][j] = in.nextInt();
        }
        //output
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j] + " ");
//            }
//            System.out.println("\n");
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
