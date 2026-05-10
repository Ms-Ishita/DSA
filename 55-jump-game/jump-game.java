class Solution {
    public boolean jump(int[] nums, int i, Boolean[] dp){
        
        if(i>=nums.length-1)return true;
        if(nums[i]==0)return false;
        if(dp[i]!=null)return dp[i];
        for(int steps =1; steps<=nums[i]; steps++){
            if(jump(nums, i+steps, dp)){
                dp[i] = true;
                return true ;
            }
        }
        dp[i] = false;
        return false;

    }
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        return jump(nums, 0, dp);
        
    }
}