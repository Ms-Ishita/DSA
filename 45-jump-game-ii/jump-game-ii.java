class Solution {
    public int minJump(int[] nums,int i,int[] dp){
        if(i>=nums.length-1)return 0;
        //if(nums[i]== 0)return 0;
        if(dp[i]!=-1)return dp[i];
        int min = Integer.MAX_VALUE;
        for(int steps=1; steps<=nums[i]; steps++){
            int ans = minJump(nums,i+steps, dp);
            if(ans!=Integer.MAX_VALUE){
                min = Math.min(min, ans+1);
            }
        }
        return dp[i] = min;

    }
    public int jump(int[] nums) {
        int[] dp =  new int[nums.length+1];
        Arrays.fill(dp, -1);
        return minJump(nums,0,dp);

        
    }
}