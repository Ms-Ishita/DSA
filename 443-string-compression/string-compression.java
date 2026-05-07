class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;
        while(right<chars.length){
            if(chars[left]!=chars[right]){
                sb.append(chars[left]);
                if(right-left>1){
                    sb.append(right-left);
                }
                left = right;
            } 
            right++;
        }
        sb.append(chars[left]);
                if(right-left>1){
                    sb.append(right-left);
                }
        for(int i =0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}