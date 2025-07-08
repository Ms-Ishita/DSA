import java.util.*;
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int count =0;
        int maxlength = 0;
        int max =0;
        Queue<Integer> q = new LinkedList<>();
        for(int right =0; right<nums.length; right++){
           if(nums[right]==0){
            count++;
            q.add(right);
            }
            if(q.size()>k)left=q.poll()+1;   
            maxlength = right-left+1;
            max=(max<maxlength)?maxlength:max;  
        }
        return max; 
    }
}