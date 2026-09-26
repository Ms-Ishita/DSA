class Solution {
    public static void backTraking(int n, int k,int start, List<Integer> ans, List<List<Integer>> result){
        if(ans.size()==k){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i =start; i<=n; i++){
            ans.add(i);
            backTraking(n,k,i+1,ans,result);
            ans.remove(ans.size()-1);
        }
        
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backTraking(n,k,1,ans,result);
        return result;
        
    }
}