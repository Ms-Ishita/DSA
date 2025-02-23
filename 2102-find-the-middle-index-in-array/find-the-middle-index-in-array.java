class Solution {
    public int findMiddleIndex(int[] nums) {
           int right_sum = 0;
       for(int num : nums){
        right_sum+=num;
       }
       int left_sum = 0;
       for(int i =0; i<nums.length; i++){

        right_sum -=nums[i];

        if(right_sum == left_sum){
            return i;
        }
       
        left_sum += nums[i];
       }
       return -1;
        
    }
}