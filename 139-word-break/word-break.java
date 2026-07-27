class Solution {
    public boolean helper(String s, List<String> wordDict, int i,Boolean[] dp ){
        if(i==s.length())return true;
        if(dp[i]!=null)return dp[i];
        for(int j=i; j<s.length(); j++){
            String part = s.substring(i,j+1);
            if(wordDict.contains(part)){
                if(helper(s,wordDict,j+1,dp))return dp[i]=true;
            }
        }
        return dp[i] = false;

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        return helper(s,wordDict,0,dp);
    }
}