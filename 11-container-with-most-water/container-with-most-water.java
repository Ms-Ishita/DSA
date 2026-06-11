class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max = 0;
        while(start<end){
            int h = Math.min(height[start], height[end]);
            int w =end-start;
            int Area = h*w;
            if(height[start]<height[end])start++;
            else end --;
            max = Math.max(max, Area);
        }
        return max;
    }
}