class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int right =0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            
            if(sum>=target){
                minLen = Math.min(minLen,right- left+1);
                left++;
                right= left;
                sum =0;
                continue;
            }
            right++;
        }
        return minLen== Integer.MAX_VALUE?0:minLen;
    }
}