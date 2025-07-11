class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m)return false;
        char[] S1 = s1.toCharArray();
        Arrays.sort(S1);
        String s3 = new String(S1);
        for(int i =0; i<=m-n; i++){
            String sub = s2.substring(i,i+n);
            char[] newA = sub.toCharArray();
            Arrays.sort(newA);
            String s4 = new String(newA);
            if(s3.equals(s4))return true;

        }
        return false;
         
    }  
}