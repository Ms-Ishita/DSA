class Solution {
    public boolean palindrom(String s){
       int start = 0;
       int end = s.length()-1;
       while(start<end){
            if(s.charAt(start)!=s.charAt(end))return false;
            start++;
            end--;
       }
       return true;
    }
 
    public int countSubstrings(String s){
        if(s.length()==0)return 0;
        int count =0;
        for(int i =0; i<s.length(); i++){
            for(int j =i; j<s.length(); j++){
                String sub = s.substring(i,j+1);
                if(palindrom(sub))count++;
            }
        }
        
       return count; 

    }
}