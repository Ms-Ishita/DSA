class Solution {
    public boolean isVowle( char ch){
       return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i =0; i<k; i++){
            if(isVowle(s.charAt(i))){
                count++;
            }
        }
        
        int left =0;
        int right = k;
        int maxCount = count;
        while(right<s.length()){
            if(isVowle(s.charAt(right)))count++;
            if(isVowle(s.charAt(left)))count--;
            maxCount = Math.max(count,maxCount);
            left++;
            right++;
        }
        return maxCount;
        
    }
}