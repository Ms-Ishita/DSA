class Solution {
    class Edges{
        int src ;
        int dest;
        int wt;
        Edges(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt= wt;
        }
    }
    class Pair{
        int node;
        int dist;
        Pair(int node, int dist){
            this.node =node;
            this.dist = dist;
        }
    }
    public int minCost(List<List<Edges>> adj, boolean[] visited){
        PriorityQueue<Pair> pq = new PriorityQueue<>((Pair p1, Pair p2)->{
            return p1.dist-p2.dist;
        });
        int cost = 0;
        pq.offer(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            if(visited[curr.node])continue;
            else visited[curr.node]=true;
            cost+=curr.dist;
            for(int i =0; i<adj.get(curr.node).size(); i++){
                Edges next = adj.get(curr.node).get(i);
                pq.offer(new Pair(next.dest,next.wt));
            }

        }
        return cost;

    }
    public int minCostConnectPoints(int[][] points) {
        List<List<Edges>> adj = new ArrayList<>();
        for(int i =0; i<points.length; i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0; i<points.length; i++){
            for(int j =i+1; j<points.length; j++){
                int wt =  Math.abs(points[i][0]-points[j][0]) + Math.abs(points[i][1]-points[j][1]);
                adj.get(i).add(new Edges(i,j,wt));
                adj.get(j).add(new Edges(j,i,wt));

            }
        }
        boolean[] visited = new boolean[points.length];
        return minCost(adj,visited);
        

    }
}