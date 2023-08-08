package Questions.Linear_Binary_Questions;
//Ceiling of a number //floor of number same approach
public class Ceiling {
    public static void main(String[] args) {
int[] arr = {2,3,4,5,9,14,16,18};
int target = 15;
        int ans = binarySearch(arr , target);
        int floor = floor(arr,target);
        System.out.println(arr[ans]);
        System.out.println(floor);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
//but what if target is greater than the end then return -1
        if(target > arr[arr.length - 1]){
            return  -1;
        }

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
        return start;
    }

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        if(target < arr[0]){
            return  -1;
        }

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
        return end;
    }
}

