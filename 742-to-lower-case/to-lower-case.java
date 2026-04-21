class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)>= 'A' && s.charAt(i)<='Z'){
                sb.append(Character.toLowerCase(s.charAt(i)));
                
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
        
    }
}