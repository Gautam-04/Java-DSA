package Packages;

import java.util.Arrays;

public class PackageArrays {
    public static void main(String[] args) {
//        int[] x = new int[5];
        int[] x = {1,5,8,7,4,9,6};
        int[] y = {1,5,8,7};

        System.out.println(x.length);
        System.out.println(Arrays.toString(x));
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));



        System.out.println(Arrays.hashCode(x));

        boolean equals = Arrays.equals(x, y);
        System.out.println(equals);

        Arrays.fill(x,2,4,-1);
        System.out.println(Arrays.toString(x));


    }
}
