package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //create a array
        int[] arr = {1 , 3 , 5, 6, 80};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0]=99;
    }
}
