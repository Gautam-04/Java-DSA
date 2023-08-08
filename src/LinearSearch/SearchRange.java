package LinearSearch;

public class SearchRange {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        int min = 1 , max = 4;
        System.out.println(search(name,target,min,max));
//        System.out.println(search2(name,target));
    }
    static boolean search(String str ,char target, int min , int max ){
        if (str.length() == 0){
            return  false;
        }
        for (int i = min; i < max; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
