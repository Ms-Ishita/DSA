class Solution {
    public List<Integer> majorityElement(int[] nums) {
         Map<Integer, Integer> map = new HashMap<>();
         List<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        int maj = nums.length/3;
        for(int keys : map.keySet()){
            if(map.get(keys)> maj){
                list.add(keys);
                
                
            }

        }
       return list;

    }
}