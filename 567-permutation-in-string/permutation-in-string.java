class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        String newStr1 = new String(ch1);
        int s1Len = newStr1.length();
        int left =0;
        int right = 0;
        while(right<s2.length()){
            if(right-left+1 == s1Len){
                String str2 = s2.substring(left, right + 1);
                char[] ch2 = str2.toCharArray();
                Arrays.sort(ch2);
                String newStr2 = new String(ch2);
                if(newStr2.equals(newStr1))return true;
                left++;
            }

            right++;
        }
        return false;
    }
}