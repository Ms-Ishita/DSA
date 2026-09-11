class Solution {
    public boolean checkMap(Map<Character, Integer> map ){
          for(char key: map.keySet()){
            if(map.get(key)!=0)return false;
        }
        return true;

    }
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if(!map.containsKey(ch))map.put(ch, 1);
            else map.put(ch, map.get(ch)+1);
        }
        int left =0;
        int s1_len = s1.length();
        for(int right =0; right<s2.length(); right++){
            char ch = s2.charAt(right);
            if(map.containsKey(ch))map.put(ch,map.get(ch)-1);
            if(right-left+1>s1_len){
                if(map.containsKey(s2.charAt(left)))map.put(s2.charAt(left), map.get(s2.charAt(left))+1);
                left++;
            }
            if(right-left+1 == s1_len && checkMap(map))return true;
                
            


        }
        return false;
        
    }
}