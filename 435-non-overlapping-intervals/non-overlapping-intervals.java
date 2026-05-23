class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[1]-b[1]);
        for(int i =0; i<intervals.length; i++){
            for(int j =0; j<intervals[0].length; j++){
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
        }
        int curr = intervals[0][1];
        int count = 0;
        for(int i =1; i<intervals.length; i++){
            if(curr>intervals[i][0]){
                count++;
            }
            else {
                curr = intervals[i][1];
            }
          
        }
        return count;
        
    }
}