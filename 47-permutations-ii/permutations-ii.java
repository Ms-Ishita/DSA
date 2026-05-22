class Solution {
    public void permutation(int[] nums, List<Integer> list, Set<List<Integer>> set, int i, boolean[] visited){
        if(i== nums.length){
            set.add(new ArrayList<>(list));
            return;
        }
        for(int j=0;  j<nums.length; j++){
            if(!visited[j]){
                visited[j] = true;
                list.add(nums[j]);
                permutation(nums, list, set, i+1, visited);
                list.remove(list.size()-1);
                visited[j] = false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        boolean[] visited = new boolean[nums.length];
        permutation(nums, list, set, 0, visited);
      
        return new ArrayList<>(set);
        
    }
}