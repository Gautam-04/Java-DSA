package BinarySearch2D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 37;
        System.out.println(Arrays.toString(search2D(arr , target)));

    }
    static  int[] search2D(int[][] matrix , int target){
int r = 0;
int c = matrix.length - 1;

while (r < matrix.length && c >= 0){
if(target == matrix[r][c]){
    return new int[]{r,c};
}
if (matrix[r][c] < target){
    r++;
} else{
c--;
}
}
        return new int[]{-1};
    }
}
