class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for(int right=0; right<s.length(); right++){
           if(!map.containsKey(s.charAt(right)))map.put(s.charAt(right), right);
           else {
            if(map.get(s.charAt(right))<left);
            else left = map.get(s.charAt(right))+1;
              map.put(s.charAt(right), right);
           }
           maxLen= Math.max(right-left+1, maxLen);

        }
        return maxLen;
        
    }
}