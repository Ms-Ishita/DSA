class Solution {
    public boolean isPath(List<List<Integer>> adj,int src,int dest, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        visited[src]= true;
        while(!q.isEmpty()){
            int curr = q.poll();
            if(curr==dest)return true;
            for(int i=0;i<adj.get(curr).size(); i++){
                int next = adj.get(curr).get(i);
                if(!visited[next]){
                    visited[next]=true;
                    q.offer(next);
                }
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