class Solution {
    int max = 0;
    public void recursion(String s, int left, int right, HashSet<Character> set){
        if(right >=s.length())return;
        char ch = s.charAt(right);
        while(set.contains(ch)){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(ch);
        max = Math.max(max, (right-left)+1);
        recursion(s,left, right+1, set);
    }
    public int lengthOfLongestSubstring(String s) {
        recursion(s, 0, 0, new HashSet<>());
        return max;
        
    }
}