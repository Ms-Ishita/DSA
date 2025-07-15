class Solution {
    public boolean isValid(String word) {
        boolean hasvowel = false;
        boolean hascons = false;
        for(int i =0; i<word.length(); i++){
            if(word.length()<3)return false;
            char ch = word.charAt(i);

            if(!Character.isLetterOrDigit(ch))return false;
            if(Character.isLetter(ch)){
                char lower = Character.toLowerCase(ch);
                if("aieou".indexOf(lower)!=-1){
                    hasvowel = true;
                }
                else{
                    hascons = true;
                }
            }
            
            
            

        }
        return hasvowel && hascons;
        
    }
}