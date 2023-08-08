package Strings;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class SB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());

        builder.reverse();
        System.out.println(builder);

    }
}
