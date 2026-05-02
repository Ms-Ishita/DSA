class Solution {
    public int robber (int[] nums, int i , int[] dp, int end){
        if(i>end)return 0;
        if(dp[i]!=-1)return dp[i];
        int skip = robber(nums, i+1, dp, end);
        int take = nums[i]+robber(nums, i+2,dp, end);
        return dp[i] = Math.max(skip, take);

    }
    public int robbering(int[] nums, int start, int end){
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robber(nums, start, dp, end);

    }
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int case1 =  robbering(nums,0,nums.length-2);
        int case2  = robbering(nums ,1, nums.length-1);
        return Math.max(case1,case2);
    }
}