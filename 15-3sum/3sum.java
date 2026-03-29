class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0; k<nums.length -2; k++){
            int i =k+1; 
            int j =nums.length-1;
            while(i<j){
                int sum = nums[k] + nums[i] + nums[j];
                if(sum == 0){
                    set.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    i++;
                    j--;
                }
                else if (sum>0)j--;
                else i++;
            }
            

        }
        return new ArrayList<>(set);


        
    }
}