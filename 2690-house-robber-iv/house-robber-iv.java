class Solution {
    public boolean isPossible(int[]nums,int mid, int k){
        int house =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]<=mid){
                house++;
                i++;
            }
        }
        return house>=k;

    }
    public int minCapability(int[] nums, int k) {
        
        
        int s= Integer.MAX_VALUE, e = Integer.MIN_VALUE;
        int result = e;
        for (int num : nums) {
            s = Math.min(s, num);
            e = Math.max(e, num);
        }
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isPossible(nums, mid, k)==true){
                result = mid;
                e= mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return result;

   

    }
}