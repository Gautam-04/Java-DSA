package Arrays;

import java.util.Arrays;

public class MaxingArray {
    public static void main(String[] args) {
        int[] arr = {20, 54, 85, 96, 12};

        System.out.println(max(arr));
    }
    //add edge cases for yourself
    static int max(int[] arr){
int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    //can do similar for between ranges
}
