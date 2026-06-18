class Solution {
    public boolean isCycle(int src, List<List<Integer>> adj,boolean[] visited,boolean[] inRecursion){
        visited[src] = true;
        inRecursion[src] = true;
        for(int i =0; i<adj.get(src).size(); i++){
            int next = adj.get(src).get(i);
            if(!visited[next]){
                if(isCycle(next, adj,visited, inRecursion))return true;
            }
            else if(inRecursion[next])return true;
        }
        inRecursion[src]= false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0; i<prerequisites.length; i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] inRecursion = new boolean[numCourses];
        for(int i =0; i<numCourses; i++){
            if(!visited[i]){
                if(isCycle(i,adj,visited, inRecursion))return false;
            }

        }
        return true;
    }
}