package Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Varargs {

    public static void main(String[] args) {
fun(2,4,5,6,9,8,7,50);
multiple(2,3,"Gautam" , "Hola");

    }

    static void multiple(int i, int i1, String...v) {

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
