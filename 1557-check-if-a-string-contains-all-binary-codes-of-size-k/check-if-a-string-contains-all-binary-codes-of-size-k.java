class Solution {
    public boolean hasAllCodes(String s, int k) {
        int total = 1<<k;
        HashSet<String> set = new HashSet<>();
        for(int i =0; i<=s.length()-k; i++){
            String str = s.substring(i, i+k);
            set.add(str);
        }
        if(total == set.size())return true;
        else  return false;
    }
}