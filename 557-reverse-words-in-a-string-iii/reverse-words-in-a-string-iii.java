class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<word.length; i++){
           int j =0;
            System.out.print(word[i]+" ");
            System.out.println();
            while(j<word[i].length()){
                st.push(word[i].charAt(j));
                //System.out.print(st);
                j++;
            }
            
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
            if(i<word.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
        
    }
}