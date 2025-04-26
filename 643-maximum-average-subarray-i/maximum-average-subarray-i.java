class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int sum = 0;
    for(int i = 0; i<k; i++){
        sum+=nums[i];
    }
    int max = sum;
    int s = 0;
    int end = k;
    while(end<nums.length){
        sum-=nums[s++];

        sum+=nums[end++];
       
        
        max = (sum>max)?sum:max;


    }
    return (double) max/k;


    }
}