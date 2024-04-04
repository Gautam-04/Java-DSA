package Aoa_Practical;

public class EXP_8_LCS {
    public static void main(String[] args) {
        String x = "ABCDEF";
        String y = "ACDBF";
        int lcs = longestSubsequence(x,y);
        System.out.println("Longest Subsequence Ans is: " + lcs);
    }

    static int longestSubsequence(String x,String y){
        int n = x.length();
        int m = y.length();
        int[][] dp = new int[n+1][m+1];

        for(int i = 0; i <= n;i++){
            for(int j = 0;j <= m;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                } else if (x.charAt(i-1) == y.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }
}
