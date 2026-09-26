class Solution {
    public void backTraking(int[] candidates, int target, int i, List<Integer> ans, List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(ans));
            return;
        }
        if(i == candidates.length || target<0) return;
        ans.add(candidates[i]);
        backTraking(candidates,target-candidates[i],i,ans,result);
        ans.remove(ans.size()-1);
        backTraking(candidates,target,i+1,ans, result);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backTraking(candidates,target,0,ans,result);
        return result;
    }
}