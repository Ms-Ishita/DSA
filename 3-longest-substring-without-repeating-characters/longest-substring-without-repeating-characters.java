class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max_length=0;
        Map<Character, Integer> hash = new HashMap<>();
        for(int right = 0; right<s.length(); right++){
            char curr = s.charAt(right);
            if(hash.containsKey(curr)&& hash.get(curr)>=left){
                left = hash.get(curr)+1;
            }
            hash.put(curr, right);
            max_length = Math.max(max_length, right-left+1);
        }
        return max_length;  

    }
}