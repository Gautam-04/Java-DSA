package LinearSearch;

import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {54,85,45},
                {87,23,6},
                {85,74,95,4},
                {87,96,52,1}
        };
        int target = 85;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row , col};
                }
            }
        }
        return new int[]{-1 ,-1};
    }
}
