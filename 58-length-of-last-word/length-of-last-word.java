class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        String  lastWord = "";
        for(String word : words){
            lastWord = word;
        }
        return lastWord.length();
    }
}