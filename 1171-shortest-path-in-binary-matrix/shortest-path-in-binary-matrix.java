class Solution {
    class Path{
        int i ;
        int j;
        Path(int i , int j ){
            this.i = i;
            this.j = j;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<Path> q = new LinkedList<>();
        q.offer(new Path(0,0));
        q.offer(null);
        int m = grid.length;
        int n = grid[0].length;
        int steps = 1;
        boolean[][] visited = new boolean[m][n];
        while(!q.isEmpty()){
            Path curr = q.poll();
            if(curr == null){
                if(q.isEmpty())break;
                else q.offer(null);
                steps++;

            }else {
                if(curr.i<0 || curr.j<0 || curr.i>=m || curr.j>=n || grid[curr.i][curr.j]==1 || visited[curr.i][curr.j])continue;
                visited[curr.i][curr.j] = true;
                if(curr.i == m-1  && curr.j == n-1)return steps;
                q.offer(new Path(curr.i+1, curr.j));
                q.offer(new Path(curr.i-1, curr.j));
                q.offer(new Path(curr.i+1, curr.j+1));
                q.offer(new Path(curr.i-1, curr.j-1));
                q.offer(new Path(curr.i, curr.j+1));
                q.offer(new Path(curr.i, curr.j-1));
                q.offer(new Path(curr.i+1, curr.j-1));
                q.offer(new Path(curr.i-1, curr.j+1));

            }
        }
        return -1 ;
    }
}