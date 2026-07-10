class Solution {
    public void backtracking(int[] nums, int i, List<Integer> list, List<List<Integer>> result){
        if(i==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        backtracking(nums,i+1,list, result);
        list.add(nums[i]);
        backtracking(nums,i+1,list, result);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums,0, list, result);
        return result;
        
    }
}