package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=23;
        arr[1]=65;
        System.out.println(arr[2]);

        //input in array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        //output in array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }

        for (int j : arr) {
            System.out.println(j + " ");
        }

        System.out.println(arr[5]); //out of bound issue

        System.out.println(Arrays.toString(arr));//best way to print


        //arrays of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
