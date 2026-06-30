class Solution {
    public int coinChange(int amount, int[] coins, int i , int[][]dp){
        if(amount == 0)return 1;
        if(amount<0 || i>=coins.length)return 0;
        if(dp[amount][i]!=-1)return dp[amount][i];
        int skip = coinChange(amount, coins, i+1,dp);
        int take =0;
        if(amount>=coins[i]){
            take = coinChange(amount-coins[i],coins,i, dp);
        }
        return dp[amount][i] = take+skip;
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount+1][coins.length];
        for(int i =0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return coinChange(amount, coins, 0,dp);

        
    }
}