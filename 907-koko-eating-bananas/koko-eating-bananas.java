class Solution {
    public boolean canEat(int[] piles,int mid, int h){
        int actualHours = 0;
        for(int i =0; i<piles.length; i++){
            actualHours+=piles[i]/mid;
            if(piles[i]%mid!=0)actualHours++;
        }
        return actualHours<=h;
    }
    public int minEatingSpeed(int[] piles, int h){
       int start=1;
       int end = 0;
       for(int i =0; i<piles.length; i++){
        end = Math.max(piles[i],end);
       }
       
       while(start<end){
        int mid = start+(end-start)/2;
         
        if(canEat(piles,mid,h)){
            end = mid;
        }
        else start = mid+1;
       }
       return start;

    }
    
}