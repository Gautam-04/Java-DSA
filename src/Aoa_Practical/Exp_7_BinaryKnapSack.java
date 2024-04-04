package Aoa_Practical;

public class Exp_7_BinaryKnapSack {
    public static void main(String[] args) {
        int[] weights = {2,4,5,6,1};
        int[] profits = {8,9,10,25,30};
        int capacity = 8;
        int maxProfit = knapSack(weights,profits,capacity);

        System.out.println("Maximum Profit we can get is: " + maxProfit);
    }

    static int knapSack(int[] weights,int[] profit, int capacity){
        int n = weights.length;
        int[][] dp = new int[n+1][capacity+1];

        for(int i = 0;i<=n;i++){
            for(int w = 0; w <= capacity;w++){
                if(i == 0 || w == 0){
                    dp[i][w] = 0;
                } else if(weights[i - 1] <= w){
                    dp[i][w] = Math.max(profit[i-1] + dp[i-1][w-weights[i-1]],dp[i-1][w]);
                }else{
                    dp[i][w] = dp[i-1][w];
                }


            }
        }

        return dp[n][capacity];
    }
}
