package Aoa_Practical;

public class KmpPractical {
    public static void main(String[] args) {
        String x = "ABCDENEWNKJNNDBEDHIEHFE";
        String pattern = "DBED";
        search(x,pattern);
    }

    static void search(String text,String pattern){
        int n = text.length();
        int m = pattern.length();
        int[] lps = computeLpsArray(pattern);

        int i = 0; // index for text[]
        int j = 0; // index for pattern[]
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

    }

    static int[] computeLpsArray(String pattern){
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0; // length of the previous longest prefix suffix

        lps[0] = 0; // lps[0] is always 0
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

}
