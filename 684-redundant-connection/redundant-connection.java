class Solution {
    // public int find()
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int src, int dest){
        if(src==dest)return true;
        if(visited[src])return false;
        visited[src] = true;
        for(int i =0; i<adj.get(src).size(); i++){
            int next = adj.get(src).get(i);
            if(dfs(adj, visited, next, dest))return true;
        }
        return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0;i<=edges.length; i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0; i<edges.length; i++){
            boolean[] visited = new boolean[edges.length+2];
            
            int v = edges[i][0];
            int u = edges[i][1];
            if(dfs(adj,visited,v,u))return new int[]{v,u};
            adj.get(v).add(u);
            adj.get(u).add(v);
        }
        return new int[]{};
        
    }
}