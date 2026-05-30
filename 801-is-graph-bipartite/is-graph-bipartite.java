class Solution {
    public boolean bipart(int[][] graph, int[] color, int src){
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        color[src] = 1;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int i =0; i<graph[curr].length; i++){
                int child = graph[curr][i];
                if(color[curr]==1 && color[child]==0){
                    color[child]=2;
                    q.offer(child);
                }
                else if (color[curr]==2 && color[child]==0){
                    color[child] =1;
                    q.offer(child);
                }
                if(color[curr]==color[child])return false;
                else continue;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for(int i =0;i<color.length; i++){
            if(color[i]==0){
                if(!bipart(graph,color,i))return false;
            }
        }
        return true;

        
    }
}