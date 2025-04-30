class Solution {
    public int findNumbers(int[] nums) {
       int[] digit= new int[nums.length];
       for(int i = 0; i<nums.length; i++){
        int count = 0;
        int num = nums[i];
        if(num==0){
            count =1;
        }
        else{
            while(num!=0){
                num = num/10;
                count++;
            }
        }
        digit[i] = count;
        
       }
       int countlength=0;
       for(int i = 0; i<digit.length; i++){
        if(digit[i]%2==0){
            countlength++;

        }
       }
       return countlength; 
    }
}