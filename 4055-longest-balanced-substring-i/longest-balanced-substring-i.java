class Solution {
    public boolean isValid(int[] freq){
        int common = 0;
        for(int i =0; i<freq.length; i++){
            if(freq[i]==0)continue;
            if(common==0){
                common = freq[i];
            }
            else if(common!=freq[i])return false;
        }
        return true;
    }
    public int longestBalanced(String s) {
        int max = 0;
        for(int i =0; i<s.length(); i++){
            // This freq array where we add freq of String s
            int[] freq = new int[26];
            for(int j =i; j<s.length(); j++){
                freq[s.charAt(j)-'a']++;
                if(isValid(freq)){
                    max = Math.max(max, j-i+1);
                }
            }
        }
        return max;
    }
}