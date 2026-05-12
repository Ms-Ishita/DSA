class Solution {
    public int findChampion(int n, int[][] edges) {
       int[] indegree = new int[n];
        for(int i =0; i<edges.length; i++){
            int winner = edges[i][0];
            int loser = edges[i][1];
            indegree[loser]++;
        }
        int count = 0;
        int champ = -1;
        for(int i =0; i<indegree.length; i++){
            if(indegree[i]==0){
                champ = i;
                count++;
            }
        }
        if(count==1)return champ ;
        else return -1;
       
       
        
    }
}