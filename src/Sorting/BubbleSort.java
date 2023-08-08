package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,6,5,4,1,3,9};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sorting(int[] arr){
        boolean swapped;
        //run the steps n-1 time
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap break and exist becoz the arr is sorted
            if(!swapped){
                break;
            }
        }
    }
}
