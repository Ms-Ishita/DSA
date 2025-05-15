class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
         
        List<String> l1 = new ArrayList<>();
        l1.add(words[0]);
        for(int i = 1; i<groups.length; i++){
            if(groups[i]!=groups[i-1]){
                l1.add(words[i]);
            }

        }
        return l1;
      
        
        
    }
}