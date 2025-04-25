class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
     int sum = 0;
     for(int i = 0; i<nums.length-2; i++){
        int left = i+1;
        int right = nums.length-1;

        while(left<right){
            sum = nums[i]+nums[left]+nums[right];
            if(sum==0){
                s.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;

            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }
             
            
        }
     }
     return new ArrayList(s);

    }
}