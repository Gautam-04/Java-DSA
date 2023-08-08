package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int [] nums = {-63,-60,-52,-20,2,5,9,12,54,65,87,96};
        int target = 12;
        int ans = binarySearch(nums , target);
        System.out.println(ans);
    }

    //return -1 if no value is returned
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            //int mid = (start + end)/2; might be possible that it gives issue
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
