package College_Practicals;

import java.util.Arrays;

public class Exp_1 {
    public static void main(String[] args) {
        int[] nums = {2,4,8,7,59,6,54,98,65,25,32,14};
        int n = nums.length;
        System.out.println(Arrays.toString(nums));
        BubbleSort(nums,n);
        System.out.print("BubbleSort Function - ");
        System.out.println(Arrays.toString(nums));
        SelectionSort(nums,n);
        System.out.print("SelectionSort Function - ");
        System.out.println(Arrays.toString(nums));
        InsertionSort(nums,n);
        System.out.print("InsertionSort Function - ");
        System.out.println(Arrays.toString(nums));
    }

    public static void BubbleSort(int[] nums,int size){
        for(int i = 0;i<size-1;i++){
            for(int j = i+1;j<size;j++){
                if(nums[j]<nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void InsertionSort(int[] nums,int size){
        for(int i = 1;i<size;i++){
            int j = i;
            while(j>0 && nums[j-1]>=nums[j]){
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }

    public static void SelectionSort(int[] nums,int size){
        for(int i = 0;i<size-1;i++){
            int mini = i;
            for(int j = i+1;j<size;j++){
                if(nums[j]<nums[mini]){
                    mini = j;
                }
            }
            if (mini != i) {
                int temp = nums[mini];
                nums[mini] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
