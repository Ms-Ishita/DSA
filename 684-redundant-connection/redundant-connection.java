class Solution {
    public boolean isPath(List<List<Integer>> adj,int src,int dest, boolean[] visited){
        if(src == dest)return true;
        visited[src] = true;
        for(int i =0; i<adj.get(src).size(); i++){
            int next = adj.get(src).get(i);
            if(!visited[next]){
                if(isPath(adj,next,dest,visited))return true;
            }
        }
        return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0; i<edges.length+1; i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            boolean[] visited = new boolean[edges.length+1];
            if(isPath(adj,u,v,visited)){
                return new int[]{u,v};
            }
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return new int[]{};
      
        
    }
}