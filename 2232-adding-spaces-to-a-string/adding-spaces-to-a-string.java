class Solution {
    public String addSpaces(String s, int[] spaces) {
       
       StringBuilder st = new StringBuilder("");
       int j = 0; //spaces ke liye
       for(int i = 0; i<s.length(); i++){
        if(j<spaces.length && i == spaces[j]){
            st.append(' ');
            j++;
        }
        st.append(s.charAt(i));
       }
       return st.toString();

    }
}