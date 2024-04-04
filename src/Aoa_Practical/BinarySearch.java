package Aoa_Practical;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,9,45,56,65,74,78,89,254,658,998};
        int n = arr.length - 1;
        int target = 254;
        int result = binarySearch(arr,0,n,target);

        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found: " + result);
        }
    }


    public static int binarySearch(int[] arr,int start,int end,int target){

        if (end >= start) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid]>target){
                return binarySearch(arr,0,mid-1,target);
            }

            return binarySearch(arr,mid+1,end,target);

        }

        return -1;
    }


}
