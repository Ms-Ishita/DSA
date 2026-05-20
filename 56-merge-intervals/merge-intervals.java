class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        List<int[]> result = new ArrayList<>();
        int[] current_interval = intervals[0];
        result.add(current_interval);
        for(int i =1; i<intervals.length; i++){
            if(intervals[i][0]<=current_interval[1]){
                current_interval[1] = Math.max(current_interval[1], intervals[i][1]); 
            }
            else {
                current_interval = intervals[i];
                result.add(current_interval);
            }
            
            
        }
        return result.toArray(new int[result.size()][]);
        
    }
}