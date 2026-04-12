class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int currSum = 0;
        int totalSum = 0;

        map.put(0, 1); // important

        for(int i = 0; i < nums.length; i++) {

            currSum += nums[i];

            // check if (currSum - k) already exists
            if(map.containsKey(currSum - k)) {
                totalSum += map.get(currSum - k);
            }

            // update map manually (no getOrDefault)
            if(map.containsKey(currSum)) {
                map.put(currSum, map.get(currSum) + 1);
            } else {
                map.put(currSum, 1);
            }
        }

        return totalSum;
    }
}