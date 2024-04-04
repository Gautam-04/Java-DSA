package Aoa_Practical;

public class NaiveString {
    public static void main(String[] args) {
        String x = "ABFOWOEROBOEROOERO";
        String pattern = "ERO";
        search(x,pattern);
    }

//    static void search(String x,String pattern) {
//        int n = x.length();
//        int m = pattern.length();
//        int i = 0;
//
//        for(i = 0; i <= n-m;i++) {
//            String sub = x.substring(i, i + m);
//            if (sub.equals(pattern)) {
//                System.out.println("Pattern matched at index: " + i);
//            }
//        }
//    }

    static void search(String x,String pattern){
        int n = x.length();
        int m = pattern.length();
        int i = 0;

        for(i = 0; i<= n-m;i++){
            String sub = x.substring(i,i+m);
            if(sub.equals(pattern)){
                System.out.println("Pattern match at the index: " + i);
            }
        }
    }

    }
