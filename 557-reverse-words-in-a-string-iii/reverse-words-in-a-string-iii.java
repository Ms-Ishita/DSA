class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<word.length; i++){
           int j =word[i].length()-1;
            System.out.print(word[i]+" ");
            System.out.println();
            while(j>=0){
                sb.append(word[i].charAt(j));
                //System.out.print(st);
                j--;
            }
            
            
            if(i<word.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
        
    }
}