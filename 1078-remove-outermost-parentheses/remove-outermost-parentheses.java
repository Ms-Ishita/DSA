class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        int si= 0;
        StringBuilder str = new StringBuilder("");
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                count++;
            }
            if(s.charAt(i)==')'){
                count--;
            }
            if(count==0){
                for(int j = si+1; j<i; j++){
                    str.append(s.charAt(j));
                }
                si=i+1;
            }

        }
        return str.toString();



        
    }
}