class Solution {
   
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalNoOfApples = 0;
        for(int i =0; i<apple.length; i++){
            totalNoOfApples +=apple[i];
        }
        Arrays.sort(capacity);
        int total_capacity= 0;
        int count =0;
        for(int i=capacity.length-1; i>=0; i--){
            total_capacity+=capacity[i];
            count++;
            System.out.print(total_capacity+" ");
            if(total_capacity>=totalNoOfApples)return count;
            
            
        }
        return -1;
    }
}