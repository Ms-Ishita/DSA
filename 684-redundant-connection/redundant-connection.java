class Solution {
    int[] parent;
    int[] rank;
    public int find(int i){
        if(i==parent[i])return i;
        return parent[i]=find(parent[i]);
    }
    public void union(int a, int b){
        int parA = find(a);
        int parB = find(b);
        if(parA==parB)return;
        if(rank[parA]>rank[parB]){
            parent[parB] = parA;
        }
        else if(rank[parB]>rank[parB])parent[parA]=parB;
        else {
            parent[parB] = parA;
            rank[parA]++;
        } 

    }
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length+1;
        parent = new int[n];
        rank = new int[n];
        for(int i =0;i<n; i++){
            parent [i] = i;
        }
        for(int i =0; i<n; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            if(find(u)==find(v))return new int[]{u,v};
            union(u,v);

        }
        return new int[]{};
    }
}