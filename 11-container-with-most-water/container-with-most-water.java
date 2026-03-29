class Solution {
    public int maxArea(int[] nums) {
       int i = 0;
       int j = nums.length-1;
       int maxArea = Integer.MIN_VALUE;
       while(i<j){
        int h= Math.min(nums[i], nums[j]);
        int weight = j-i;
        int area = h*weight;
        maxArea= Math.max(area, maxArea);
        if(nums[i]<nums[j])i++;
        else j--; 
       } 
      
       return maxArea;
        
    }
}