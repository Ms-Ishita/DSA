class Solution {
    public int minCost (int[] cost,int[] dp, int i, int n){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        int ways1   = cost[i]+minCost(cost,dp,i+1,n);
        int ways2 = cost[i]+minCost(cost,dp,i+2,n);
        return dp[i] = Math.min(ways1,ways2);

    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(
            minCost(cost, dp, 0, n),
            minCost(cost, dp, 1, n)
        );
        
    }
}