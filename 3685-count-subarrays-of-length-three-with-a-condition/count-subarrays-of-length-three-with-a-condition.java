class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j = i ; j<nums.length; j++){
                if(j-i+1==3){
                    if((nums[i]+nums[i+2])*2==nums[i+1]){
                    count++;
                    }
                }
            }
            
        }
        return count;

    }
}