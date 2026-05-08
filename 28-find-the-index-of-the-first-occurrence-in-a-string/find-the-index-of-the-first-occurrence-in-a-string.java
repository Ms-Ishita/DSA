class Solution {
    public int strStr(String haystack, String needle) {
        int left =0;
        int right = 0;
        while(right<haystack.length()){
            if(right-left+1 == needle.length()){
                if(haystack.substring(left, right+1).equals(needle)){
                    return left;
                }
                else left++;
            }

            right++;
        }
        return -1;
        
    }
}