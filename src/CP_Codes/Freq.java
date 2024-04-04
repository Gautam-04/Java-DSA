package CP_Codes;

import java.util.Arrays;

public class Freq {
    public static void main(String[] args) {
//        String[] bank = {"0110001", "000000", "0001001"};
//        int[] freq = new int[bank.length];
//
//        for (int i = 0; i < bank.length; i++) {
//            for (int j = 0; j < bank[i].length(); j++) {
//                if (bank[i].charAt(j) == '1') {
//                    freq[i] += 1;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(freq));

        int[] nums = {10,9,2,5,3,7,101,18};
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        System.out.println(Arrays.toString(dp));

        int maxLength = 1;


        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }


        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        System.out.println(maxLength);

    }
}
