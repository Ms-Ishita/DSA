class Solution {
    public int firstMissingPositive(int[] nums) {
    Set<Integer> set = new HashSet<>();
        for(int i =0; i<nums.length; i++){
            if(nums[i]>0){
                set.add(nums[i]);  
            }
        }
        int i=1;
        while(set.contains(i)){
            
            i++;
        }
        return i;
    }
}