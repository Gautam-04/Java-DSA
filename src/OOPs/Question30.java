package OOPs;

public class Question30 {
//    Create an array with a fixed size and attempt to access an element outside the array's bounds. Use
//    a try-catch block to handle the "ArrayIndexOutOfBoundsException.
public static void main(String[] args) {
    int[] Arr = {2,4,2,5,6};

    try{
        for (int i = 0; i < 6; i++) {
            System.out.println(Arr[i]);
        }
    }catch (ArrayIndexOutOfBoundsException e){
        System.err.println("Out of bound exception");
    }
}
}
