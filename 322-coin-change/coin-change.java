class Solution {
    public int coins(int[] coins, int amount, int i, int[][] dp){
        if(amount == 0)return 0;
        if(i==coins.length || amount<0)return Integer.MAX_VALUE;
        if(dp[i][amount]!=-1)return dp[i][amount];
        int skip = coins(coins, amount, i+1, dp);
        int take = Integer.MAX_VALUE;
        if(amount>=coins[i]){
            int res = coins(coins, amount-coins[i], i, dp);
            if(res!=Integer.MAX_VALUE)take = 1+res;
        }
        return dp[i][amount] = Math.min(skip, take);

    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp= new int[coins.length+1][amount+1];
        for(int i =0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
       int ans = coins(coins,amount,0,dp);
       return ans==Integer.MAX_VALUE?-1:ans;
        
    }
}