package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {5,4,3,21,9,84,1};
        arr = Sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] Sorting(int[] arr){
if(arr.length == 1){
    return arr;
}
int mid = arr.length/2;
int[] left = Sorting(Arrays.copyOfRange(arr,0,mid));
int[] right = Sorting(Arrays.copyOfRange(arr,mid,arr.length));

return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second){
int[] mix = new int[first.length + second.length];
int i = 0;
    int j = 0;
    int k = 0;
    while(i < first.length && j< second.length){
        if(first[i] < second[j]){
            mix[k] = first[i];
            i++;
        } else{
            mix[k] = second[j];
            j++;
        }
        k++;
    }
    //it may be possible that one arrays is not completed
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
