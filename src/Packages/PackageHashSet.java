package Packages;

import java.util.HashSet;
import java.util.Set;

public class PackageHashSet {
    public static void main(String[] args) {
        HashSet<Integer> x = new HashSet();

        x.add(50);
        x.add(90);

        System.out.println(x);

        boolean contains = x.contains(90);
        System.out.println(contains);
    }
}
