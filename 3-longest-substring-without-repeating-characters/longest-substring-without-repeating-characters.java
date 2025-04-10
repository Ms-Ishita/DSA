class Solution {
    public int lengthOfLongestSubstring(String s) {

       // int right = 0;
        int left = 0;
        int max_length = 0;
        HashSet<Character> st = new HashSet<>();
        for(int right = 0; right<s.length(); right++){
            while(st.contains(s.charAt(right))){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(s.charAt(right));
            max_length= Math.max(max_length,right-left+1);
        }
        return max_length;

    }
}