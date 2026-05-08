class Solution {
    public void backTracking(String curr,int n, List<String> list){
        if(curr.length()==n){
            list.add(curr);
            return;
        }
        backTracking(curr+"0", n,list);
        backTracking(curr+"1", n, list);
        
        
    }
    public String findDifferentBinaryString(String[] nums) {
        List<String> list = new ArrayList<>();
        backTracking("",nums[0].length(),list);
        //System.out.print(list);
        Set<String> set = new HashSet<>(Arrays.asList(nums));
        for(String s: list){
            if(!set.contains(s))return s;
        }
        return "";
        
    }
}