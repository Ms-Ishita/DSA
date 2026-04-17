class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length()<p.length())return new ArrayList<>();
        int pLen = p.length();
        int sLen = s.length();
        char[] ch1 = p.toCharArray();
        Arrays.sort(ch1);
        String oldStr = new String(ch1);
        int left =0;
        int right =0;
        while(right<sLen){
            if((right-left)+1 == pLen){
                String str2 = s.substring(left, right+1);
                char[] ch2 = str2.toCharArray();
                Arrays.sort(ch2);
                String newStr = new String(ch2);
                if(newStr.equals(oldStr)){
                    list.add(left);
                }
                left++;
            }

            right++;
        }
        return list;

    }
}