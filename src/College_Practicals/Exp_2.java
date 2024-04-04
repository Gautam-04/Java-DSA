package College_Practicals;

import java.util.Arrays;

public class Exp_2 {
    public static void main(String[] args) {
//        int[] nums = {4,5,6,8,9,4};
//        int target = 8;
//        int end = nums.length-1;
//        LinearSearch(nums,end,target);
//        int start = 0;
//        int ans = BinarySearchexp2(nums,end,target,start);
//        System.out.println(ans);
        int[] nums = {4,9,7,8,5,4,6,2,45,89,65,23,54,10,23,65,74};
        Sort(nums,0, nums.length-1);
        System.out.print(Arrays.toString(nums));
    }
//    static void LinearSearch(int[] nums,int n,int target){
//        for (int i = 0; i <= n; i++) {
//            if(nums[i] == target){
//                System.out.println("Element found");
//            }
//        }
//    }
//
//    static int BinarySearchexp2(int[] nums,int end,int target,int start){
//        while(start<=end){
//            int mid = (start + end)/2;
//
//            if(nums[mid] == target){
//                return mid;
//            }
//
//            if(target > nums[mid]){
//                start = mid+1;
//            }
//
//            if(target < nums[mid]){
//                end = mid-1;
//            }
//        }
//        return -1;
//    }
    static void Sort(int[] nums,int low,int high){
//        if(nums.length == 1){
//            return nums;
//        }
//        int mid = nums.length/2;
//        int[] left = Sort(Arrays.copyOfRange(nums,0,mid));
//        int[] right = Sort(Arrays.copyOfRange(nums,mid,nums.length));
//
//        return merge(left,right);
        if(low>high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = nums[s];

        while(s<=e){
            while (nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        Sort(nums,low,e);
        Sort(nums,s,high);
    }

//    static int[] merge(int[] first,int[] second){
//        int[] max = new int[first.length + second.length];
//        int i = 0,j = 0,k =0;
//        while(i< first.length && j< second.length){
//            if(first[i] < second[j]){
//                max[k] = first[i];
//                i++;
//            } else {
//                max[k] = second[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i < first.length){
//            max[k] = first[i];
//            k++;
//            i++;
//        }
//        while (j < second.length){
//            max[k] = second[j];
//            k++;
//            j++;
//        }
//
//        return max;
//    }
}
