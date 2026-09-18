class Solution {
    int count =0;
    public int totalNQueens(int n) {
        int[][] board = new int[n][n];
        solve(n,board,0);
        return count;
    }
        void solve(int n, int[][] board, int row){
            if(row == n){
                count++;
                return;
            }
            for(int col=0; col<n; col++){
                if(isSafe(row,col, board)){
                    board[row][col]= 1;
                    solve(n,board,row+1);
                    board[row][col] = 0;
                }
            }
        }
        boolean isSafe(int row, int col, int[][] board){
            for(int i =0; i<row; i++){
                if(board[i][col]==1)return false;
            }
            int i = row-1;
            int j = col-1;
            while(i>=0 && j>=0){
                if(board[i][j]==1)return false;
                i--;
                j--;
            }
            i = row-1;
            j =col+1;
            int n = board.length;
            while(i>=0 &&j<n){
                if(board[i][j]==1)return false;
                i--;
                j++;

            }
            return true;


        }
}