class Solution {
    public int findDuplicate(int[] nums) {
       Map<Integer, Integer> map= new HashMap<>();
       for(int i =0; i<nums.length; i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i], 1);
        }
        else{
            map.put(nums[i], map.get(nums[i])+1);

        }
       } 
       for(int keys : map.keySet()){
        if(map.get(keys)>1){
            return keys;

        }
       }
       return -1;
       
    }
}