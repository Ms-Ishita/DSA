class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];
        for(int i =0; i<nums.length; i++){
            if(!map.containsKey(nums[i]))map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i])+1);
        
        }
        
        for(int i =0; i<k; i++){
            int max = -1;
            int ele = -1;
            for(int key: map.keySet()){
                if(map.get(key)> max){
                    max= map.get(key);
                    ele = key;
                }
                

            }
            arr[i]= ele;
            map.remove(ele);

        }
        return arr;
        
    }
}