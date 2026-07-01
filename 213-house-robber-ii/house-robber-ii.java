class Solution {
    public int robbering(int[] nums, int i, int end, Integer[] dp){
        if(i>end)return 0;
        if(dp[i]!=null)return dp[i];
        int skip = robbering(nums, i+1, end,dp);
        int take = nums[i]+robbering(nums,i+2, end,dp);
        return dp[i] = Math.max(take, skip);
    }
    public int robber(int[] nums, int start, int end){
        Integer[] dp = new Integer[nums.length+1];
        return robbering(nums, start, end, dp);
        
    }
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        return Math.max(robber(nums,0,nums.length-2), robber(nums,1,nums.length-1));
    }
}