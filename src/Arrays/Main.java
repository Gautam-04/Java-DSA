package Arrays;

public class Main {
    public static void main(String[] args) {
        //Q: store a roll number;
        int a = 19;

        //Q: store a person's name
        String name = "Gautam";

        //what if you want to add 500 numbers or names for that we use arrays or string
        //syntax
        //datatype[] variable_name = new datatype[size];
        int[] rollno = new int[5];
        //or directly
        int[] roll = {0, 5, 4, 9 ,30};

        int ros[]; //declaration of array defined in stack
        ros = new int[5]; //it is initialised here defined in heap

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }

}
