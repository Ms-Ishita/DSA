class Solution {
    public boolean checkMapIsEmpty(Map<Character, Integer> map){
        for(char key: map.keySet()){
            if(map.get(key)!=0)return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> map = new HashMap<>();
        int s1Len = s1.length();
        int s2Len = s2.length();
        for(int i =0; i<s1Len; i++){
            char ch = s1.charAt(i);
            if(!map.containsKey(ch))map.put(ch, 1);
            else map.put(ch, map.get(ch)+1);
        }
        int left = 0;
        int right = 0;
        while(right<s2Len){
            
            if(map.containsKey(s2.charAt(right))){
                map.put(s2.charAt(right), map.get(s2.charAt(right))-1);

            }
            if((right-left)+1> s1Len){
                if(map.containsKey(s2.charAt(left))){
                    map.put(s2.charAt(left), map.get(s2.charAt(left))+1);
                }
                left++;
            }
            if((right-left)+1 == s1Len && checkMapIsEmpty(map))return true;
             right++;

        }
       
        return false;
    }
}