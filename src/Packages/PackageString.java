package Packages;

import java.util.Arrays;

public class PackageString {
    public static void main(String[] args) {
        String y = "   Hello world i am dynamic";
        System.out.println(Arrays.toString(y.split("Hello", 4)));
        System.out.println(y.length());
        System.out.println(y.trim());
        System.out.println(y.toLowerCase());
        System.out.println(y.toUpperCase());
        System.out.println(y.toCharArray());
        System.out.println(y.charAt(5));
        System.out.println(y.isEmpty());
    }
}
