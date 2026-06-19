class Solution {
    public int editDistance(String word1, String word2, int i, int j, Integer[][] dp){
        if(i==word1.length())return word2.length()-j;
        if(j==word2.length())return word1.length()-i;
        if(dp[i][j] != null)return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j))return dp[i][j] = editDistance(word1,word2,i+1, j+1,dp);
        int insert = 1+editDistance(word1,word2,i,j+1,dp);
        int delete = 1+editDistance(word1,word2,i+1,j,dp);
        int replace = 1+editDistance(word1,word2,i+1,j+1,dp);
        return dp[i][j] = Math.min(insert, Math.min(delete,replace));
    }
    public int minDistance(String word1, String word2) {
        Integer[][] dp = new Integer[word1.length()][word2.length()];
        return editDistance(word1,word2,0,0,dp);
    }
}