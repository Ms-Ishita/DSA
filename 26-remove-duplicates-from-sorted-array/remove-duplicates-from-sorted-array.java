class Solution {
    public int removeDuplicates(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // int j =0;
        // for(int i =0; i<nums.length; i++){
        //     if(set.contains(nums[i]))continue;
        //     else{
        //         set.add(nums[i]);
        //         nums[j++] = nums[i];
        //     }
            
        // }
        // return set.size();
        int i =0;
        for(int j =1; j<nums.length; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }

        }
        return i+1;
    }
}