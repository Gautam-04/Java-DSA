package Arrays;

import java.util.Arrays;

public class PassinginFucn {
    public static void main(String[] args) {
        int[] nums = {95, 54, 45 ,85 ,48};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=99;

    }
}
