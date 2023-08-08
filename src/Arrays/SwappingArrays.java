package Arrays;
//swapping and reversing an arrays
import java.util.Arrays;

public class SwappingArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start<end){
            //swap
            swap(arr , start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index0, int index2 ){
int temp = arr[index0];
arr[index0] = arr[index2];
arr[index2] = temp;
    }
}
