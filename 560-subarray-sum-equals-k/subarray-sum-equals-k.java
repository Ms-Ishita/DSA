class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        int totalSum = 0;
        map.put(0,1);
        for(int i =0; i<nums.length; i++){
            currSum += nums[i];
            if(map.containsKey(currSum - k)){
                totalSum+=map.get(currSum-k);
            }
            if(!map.containsKey(currSum)){
                map.put(currSum, 1);
            }
            else map.put(currSum, map.get(currSum)+1);
        }
        return totalSum;
    }
}