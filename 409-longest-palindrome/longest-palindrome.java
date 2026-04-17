class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
      

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        boolean oddFound = false;
        int len = 0;
        for(char key : map.keySet()){
            if(map.get(key)%2==0){
                len+=map.get(key);
            }
            else{ 
                len+=map.get(key)-1;
                oddFound= true;
            }
        }
        if(oddFound)len++;
        return len;

     
    
        
        
    }
}