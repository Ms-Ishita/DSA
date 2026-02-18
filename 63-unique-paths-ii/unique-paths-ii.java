import java.util.Arrays;

class Solution {
    
    public int unique(int[][] grid, int i, int j, int[][] dp) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        // 1. Out of bounds
        if(i >= m || j >= n) return 0;
        
        // 2. Obstacle
        if(grid[i][j] == 1) return 0;
        
        // 3. Destination
        if(i == m - 1 && j == n - 1) return 1;
        
        // 4. Memo check
        if(dp[i][j] != -1) return dp[i][j];
        
        int down = unique(grid, i + 1, j, dp);
        int right = unique(grid, i, j + 1, dp);
        
        return dp[i][j] = down + right;
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        if(obstacleGrid[0][0] == 1) return 0;
        
        int[][] dp = new int[m][n];   // ✅ correct size
        
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return unique(obstacleGrid, 0, 0, dp);
    }
}