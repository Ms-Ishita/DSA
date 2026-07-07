class Solution {
    //s1 = aabcc s2 = dbbca s3 = aadbbbaccc --> aa
    public boolean helper(String s1, String s2, String s3, int i, int j, Boolean[][] dp){
        if(s1.length() + s2.length() != s3.length())return false;
        if(i==s1.length() && j==s2.length())return true;
        int k = i+j;
        if(dp[i][j]!=null)return dp[i][j];
        if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
            if(helper(s1,s2,s3,i+1,j,dp))return dp[i][j]= true;
        }
        if(j<s2.length() && s2.charAt(j)==s3.charAt(k)){
            if(helper(s1,s2,s3,i,j+1,dp))return dp[i][j]=true;
        }
        return dp[i][j] = false;
  
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        Boolean[][] dp = new Boolean[s1.length()+1][s2.length()+1];
        return helper(s1,s2,s3,0,0,dp);
    

    }
}