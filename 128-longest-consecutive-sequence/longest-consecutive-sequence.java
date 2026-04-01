class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Map<Integer, Boolean> map  = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            map.put(nums[i], false);
        }
        int max = 0;
        for(int i =0; i<nums.length; i++){
            int curr = nums[i];
            if(map.get(curr) == true)continue;
            // going forward 
            int count = 1;
            while(map.containsKey(curr+1) && map.get(curr+1)== false){
                count++;
                curr++;
                map.put(curr, true );
                // System.out.println(curr);
            }
            curr = nums[i];
             while(map.containsKey(curr-1) && map.get(curr-1)== false){
                count++;
                curr--;
                map.put(curr, true );
                // System.out.println(curr);
            }
            max = Math.max(count, max);

        }
        return max;
        
    }
}