class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i<ransomNote.length(); i++){
            if(!map.containsKey(ransomNote.charAt(i)))map.put(ransomNote.charAt(i), 1);
            else map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))+1);

        }
        for(int i =0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
            }
        }
        
        return map.isEmpty();
        

        
    }
}