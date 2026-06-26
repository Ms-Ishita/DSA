class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==1 && nums[0]==0)return 0;
        int count = 0;
        int maxCount = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                maxCount = Math.max(count, maxCount);
            }else {
                count=0;
            }
        }
        return maxCount;
        
    }
}