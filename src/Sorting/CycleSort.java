package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sorting(int[] nums){
int i = 0;
while(i < nums.length){
    int correct = nums[i] - 1;
    if(nums[i] != nums[correct]){
        swap(nums,i,correct);
    } else{
        i++;
    }

} 
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
