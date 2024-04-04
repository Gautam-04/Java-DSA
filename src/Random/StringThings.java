package Random;

import java.util.Arrays;

public class StringThings {
    public static void main(String[] args) {
        String num = "4875487541";

        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 != 0) {
                num = num.substring(0, i + 1);
                break;  // exit the loop once you find the first odd digit
            }
        }
        System.out.println(num);
    }
}
