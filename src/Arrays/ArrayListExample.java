package Arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
