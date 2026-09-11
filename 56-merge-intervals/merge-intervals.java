class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        List<int[]> list = new ArrayList<>();
        int[] currInterval = intervals[0];

        for(int i =1; i<intervals.length; i++){
            if(intervals[i][0]<=currInterval[1]){
                currInterval[1] = Math.max(currInterval[1], intervals[i][1]);
            }
            else{
                list.add(currInterval);
                currInterval = intervals[i];
            }
        }
        list.add(currInterval);
        return list.toArray(new int[list.size()][]);
        
        
        
    }
}