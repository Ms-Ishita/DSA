class Solution {
    public int maxArea(int[] height) {
        int i =0;
        int j = height.length-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            int h = Math.min(height[i], height[j]);
            int w = j-i;
            int Area = h*w;
            max = Math.max(Area, max);
            if(height[i]<height[j])i++;
            else j--;

        }
        return max;

        
        
    }
}