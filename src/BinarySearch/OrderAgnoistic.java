package BinarySearch;
//OrderAgnostic BinarySearch
public class OrderAgnoistic {
    public static void main(String[] args) {
        int [] nums = {1,3,4,6,9,12,52,63,96};
        int target = 12;
        int ans = search(nums , target);
        System.out.println(ans);
    }
    static int search(int[] nums,int target){
        int start = 0;
        int end = nums.length -1;

        //find whether the array is sorted in ascending or discending
        boolean isAsc;
        isAsc= nums[start] < nums[end];


        while (start <= end){
            //int mid = (start + end)/2; might be possible that it gives issue
            int mid = start + (end - start) / 2;

            if (nums[mid] == target){
                return mid;
            }
        if(isAsc) {
            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else{
            if (target > nums[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        }
        return -1;
    }
}
