class Solution {
    int min= Integer.MAX_VALUE;
    public int pathSum(int[][] grid,int m, int n, int i , int j, int[][] dp){
        if(i==m-1 && j == n-1)return grid[i][j];
        if(i>=m || j>=n)return Integer.MAX_VALUE;
        if(dp[i][j]!=-1)return dp[i][j]; 
        int down = pathSum(grid,m,n,i+1,j,dp);
        int right = pathSum(grid,m,n,i,j+1,dp);
        
        int best= Math.min(down, right);
        // if(best == Integer.MAX_VALUE){
        //     return dp[i][j] = Integer.MAX_VALUE;
        // }
        return dp[i][j] = grid[i][j] + best;
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i =0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        return pathSum(grid, m,n, 0,0,dp);

        
    }
}