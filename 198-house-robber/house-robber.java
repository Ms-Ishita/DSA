class Solution {
    public int robbering(int[] nums, int i, int[] dp){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int exclude = robbering(nums, i+1, dp);
        int include = nums[i]+robbering(nums, i+2, dp);
        return dp[i] = Math.max(exclude, include);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return robbering(nums, 0, dp);
        
    }
}