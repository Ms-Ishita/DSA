class Solution {
    public boolean candi_Dis(int[] candies, int mid, long k){
        long count= 0;
        for(int i =0 ; i<candies.length; i++){
            count+=candies[i]/mid;


            if(count>=k){
                return true;
            }
        }
        return count>=k;
    }
    public int maximumCandies(int[] candies, long k) {
   int max_candies = 0;
        int n = candies.length;
        long total_candi = 0;  
        
       
        for (int i = 0; i < n; i++) {
            total_candi += candies[i];
            max_candies = Math.max(max_candies, candies[i]);
        }
        

        if (total_candi < k) {
            return 0;
        }
        int s = 1;
        int e = max_candies;
        int result = 0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(candi_Dis(candies, mid, k)){
                result= mid;
                s=mid+1;
            }
            else{
                e = mid-1;
            }
        }
        
        
        
        
        return result; 
    
        
    }
}