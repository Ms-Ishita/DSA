class Solution {
    public void backTracking(int[] nums, List<Integer> list, List<List<Integer>> result, boolean[] visited){
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i =0;i<nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                list.add(nums[i]);
                backTracking(nums,list,result,visited);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backTracking(nums,list,result,visited);
        return result;
        
    }
}