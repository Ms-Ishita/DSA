//this is DFS solution
// class Solution {
//     int INF = 100000;
//     public int dfs(int[][] mat,int i, int j,boolean[][] visited, int[][] dp){
//         if(i<0|| j<0 || i>=mat.length || j>=mat[0].length || visited[i][j])return INF;
//         if(dp[i][j]!=-1)return dp[i][j];
//         if(mat[i][j]==0)return 0;
//         visited[i][j] = true;

//         int down  =  1+dfs(mat, i+1, j, visited, dp);
//         int up    =  1+dfs(mat, i-1, j, visited, dp);
//         int right =  1+dfs(mat, i, j+1, visited, dp);
//         int left  =  1+dfs(mat, i, j-1, visited, dp);

//         visited[i][j] = false;
//         return dp[i][j]=Math.min(Math.min(up, down),Math.min(right, left));

//     }
//     public int[][] updateMatrix(int[][] mat) {
//         int m = mat.length;
//         int n = mat[0].length;

//         int[][] dp = new int[m][n];

//         for (int i = 0; i < m; i++) {
//             Arrays.fill(dp[i], -1);
//         }
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {

//                 boolean[][] visited = new boolean[m][n];
//                 dp[i][j] = dfs(mat, i, j, visited, dp);
//             }
//         }
//         return dp; 

//     }
// }
//this is the BFS solution 
// class Solution {

//     public class Node{
//         int i;
//         int j;
//         Node(int i,int j){
//             this.i = i;
//             this.j = j;
//         }
//     }

//     public int[][] updateMatrix(int[][] mat) {
//         Queue<Node> queue = new LinkedList<>();
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat[0].length;j++){
//                 if(mat[i][j]==0){
//                     queue.offer(new Node(i,j));
//                 }
//             }
//         }
//         queue.offer(null);
//         int steps =0;
//         boolean[][] visited= new boolean[mat.length][mat[0].length];
//         int[][] ans = new int[mat.length][mat[0].length];
//         while(!queue.isEmpty()){
//             Node curr = queue.poll();
//             if(curr==null){
//                 if(queue.isEmpty()){
//                     break;
//                 }
//                 steps++;
//                 queue.offer(null);
//             }
//             else{
//                 int i=curr.i;
//                 int j=curr.j;
//                 if(i<0||j<0||i>=mat.length||j>=mat[0].length||visited[i][j])continue;
//                 visited[i][j]=true;
//                 if(mat[i][j]==1)ans[i][j]=steps;
//                 queue.offer(new Node(i+1,j));
//                 queue.offer(new Node(i-1,j));
//                 queue.offer(new Node(i,j+1));
//                 queue.offer(new Node(i,j-1));
//             }

//         }
//         return ans;
//     }
// }


class Solution {
    class Node{
        int i;
        int j;
        Node(int i , int j){
            this.i = i;
            this.j = j;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        Queue<Node> q = new LinkedList<>();
        for(int i =0; i<mat.length; i++){
            for(int j =0; j<mat[0].length; j++){
                if(mat[i][j]==0){
                    q.offer(new Node(i, j));
                }

            }
        }
        int steps = 0;
        boolean[][] visited= new boolean[mat.length][mat[0].length];
        int[][] ans = new int[mat.length][mat[0].length];
        q.offer(null);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr == null){
                if(q.isEmpty())break;
                steps++;
                q.offer(null);
            }
            else {
                if(curr.i<0 || curr.j<0 || curr.i>=mat.length || curr.j>=mat[0].length || visited[curr.i][curr.j])continue;
                visited[curr.i][curr.j]=true;
                if(mat[curr.i][curr.j]==1)ans[curr.i][curr.j]=steps;
                q.offer(new Node(curr.i+1,curr.j));
                q.offer(new Node(curr.i-1,curr.j));
                q.offer(new Node(curr.i,curr.j+1));
                q.offer(new Node(curr.i,curr.j-1));



            }
        }

        return ans;
    }
}