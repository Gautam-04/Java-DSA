package LinearSearch;

public class Main {
    public static void main(String[] args) {
int [] nums = {23,54,12,48,18,59};
int target = 12;
int ans = search(nums , target);
        System.out.println(ans);
    }
    //search in the array: return the index if the item found
    //otherwise it item not found return -1;
    //it returns index value
//    static  int search(int[] arr , int target){
//         it returns index value
//if(arr.length == 0){
//    return -1;
//}
////run a for loop
//        for (int index = 0; index < arr.length; index++) {
////check for element at every index if it is  = target
//            int element = arr[index];
//            if(element == target){
//                return index;
//            }
//        }
//        return -1;
//    }
//it returns value
    static  int search(int[] arr , int target){

        if(arr.length == 0){
            return -1;
        }
//run a for loop
        for (int index = 0; index < arr.length; index++) {
//check for element at every index if it is  = target
            int element = arr[index];
            if(element == target){
                return element;
            }
        }
        return -1;
    }
}
