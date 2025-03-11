class Solution {
    public int numberOfSubstrings(String s) {
       int count = 0;
       int left = 0;
       int n = s.length();
       int[] hash ={0,0,0};
       for(int i = 0; i<n ; i++){
       
        char c = s.charAt(i);

        if(c=='a')hash[0]++;
        else if(c=='b')hash[1]++;
        else if(c=='c')hash[2]++;

        while (hash[0] > 0 && hash[1] > 0 && hash[2] > 0) {
                count += n - i; 
                char leftChar = s.charAt(left);
                if (leftChar == 'a') hash[0]--;
                else if (leftChar == 'b') hash[1]--;
                else if (leftChar == 'c') hash[2]--;
                left++;
              
            }

        }
        
        
    return count;
}
}