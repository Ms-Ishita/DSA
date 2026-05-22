class Solution {
    public  void backtraking(int[] nums, List<List<Integer>> list, List<Integer> result, int i, boolean[] visited ){
        if(i==nums.length){
            list.add(new ArrayList<>(result));
            return;
        }
        for(int j =0; j<nums.length; j++){
            if(!visited[j]){
            visited[j] = true;
            result.add(nums[j]);
            backtraking(nums,list,result,i+1,visited);
            result.remove(result.size()-1);
            visited[j] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtraking(nums,list,result,0,visited);
        return list;
        
    }
}