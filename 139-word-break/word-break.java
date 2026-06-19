class Solution {
    public boolean solve(String s, List<String> wordDict,int i,Boolean[] dp){
        if(i == s.length())return true;
        if(dp[i]!=null)return dp[i];
        for(int l = i; l<s.length(); l++){
            String part = s.substring(i, l+1);
            if(wordDict.contains(part)){
                if(solve(s,wordDict,l+1, dp))return dp[i]=true;
            }  
        }
        return dp[i]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        return solve(s, wordDict, 0, dp);
    }
}