class Solution {
    
    public int solve(int[][] obstacleGrid,int i,int j, int[][] dp){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;       
        if(i<0 || j<0 || i>=m || j>=n || obstacleGrid[i][j]==1)return 0;
        if(i == m-1 && j == n-1)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        return dp[i][j] = solve(obstacleGrid, i+1,j, dp) + solve(obstacleGrid, i, j+1, dp);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i =0; i<obstacleGrid.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(obstacleGrid, 0,0,dp);
        
    }
}