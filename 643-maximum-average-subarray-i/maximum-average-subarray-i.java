class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double sum = 0;
    for(int i=0; i<k; i++){
        sum+=nums[i];
    }
    double max = sum;
    int left=0;
    int right = k;
    while(right<nums.length){
        sum-=nums[left++];
        sum+=nums[right++];
        max = Math.max(sum, max);

    }
    return max/k;
    
        

        
    }
}