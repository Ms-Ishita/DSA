class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        int maj = nums.length/2;
        for(int keys : map.keySet()){
            if(map.get(keys)> maj){
                return keys;
            }

        }
        return -1;

    }
}