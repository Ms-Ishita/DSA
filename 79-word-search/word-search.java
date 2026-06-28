class Solution {
    public boolean search(char[][]board,int i, int j, int idx,String word,boolean[][] visited){
      if(idx>=word.length())return true;
      if(i<0 || j<0 || i>=board.length || j>=board[0].length || visited[i][j] || word.charAt(idx)!=board[i][j])return false;
      visited[i][j]= true;
      boolean found = search(board,i+1,j,idx+1,word,visited)|| search(board,i-1,j,idx+1,word,visited) || search(board,i,j+1,idx+1,word,visited) || search(board,i,j-1,idx+1,word,visited);
      visited[i][j] = false;
      return found;
    }
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i =0; i<board.length; i++){
            for(int j =0; j<board[0].length; j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(board,i,j,0,word,visited))return true;
                }
            }
        }
        return false;
    }
}