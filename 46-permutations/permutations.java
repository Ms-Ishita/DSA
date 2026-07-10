class Solution {
    public void backtracking(int[] nums,boolean[] visited, List<Integer>list, List<List<Integer>>result){
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i =0; i<nums.length; i++){
            if(!visited[i]){
                visited[i]=true;
                list.add(nums[i]);
                backtracking(nums,visited,list,result);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
  
    }
    public List<List<Integer>> permute(int[] nums){
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtracking(nums,visited,list,result);
        return result;
        
    }
}