package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {5,4,3,2,1};
Sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] nums,int low,int hi){
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        Sort(nums, low, e);
        Sort(nums, s, hi);
    }
}
