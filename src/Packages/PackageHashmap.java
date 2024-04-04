package Packages;

import java.util.HashMap;
import java.util.Map;

public class PackageHashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(5,80);
        map.put(9,6);
        map.put(8,9);
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue(7));
        int a = map.get(5);
        System.out.println(a);

        System.out.println(map.clone());
        System.out.println(map.entrySet());
    }
}
