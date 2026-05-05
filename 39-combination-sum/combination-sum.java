class Solution {
    public  void comSum(int[] candidates, int target , List<Integer> list1, List<List<Integer>> list2, int i){
        if(target ==0){
            list2.add(new ArrayList<>(list1));
            return;
        }
        if(i== candidates.length || target<0) return;

        list1.add(candidates[i]);
        comSum(candidates, target - candidates[i], list1, list2, i);
        list1.remove(list1.size()-1);
        comSum(candidates, target, list1, list2, i+1);


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list1 = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        comSum(candidates, target, list1, list2, 0);
        return list2;
        
    }
}