package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDupli {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

int[] nums = new int[5];
//input
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int j = 1;
        for (int i = 0; i<nums.length; i++) {
            if(nums[i - 1] != nums[i]){
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(j);
        System.out.println(Arrays.toString(nums));

    }
}
