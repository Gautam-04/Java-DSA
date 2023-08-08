package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,9,8,74,1,2};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sorting(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxInder(arr ,0,last);

            swap(arr,maxIndex,last);
        }
    }

    private static int getMaxInder(int[] arr,int start,int end){
        int max = start;

        for (int i = start; i <= end ; i++) {
            if(arr[max] < arr[i]){
                max=i;
            }
        }
        
        return max;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
