class Solution {
    public boolean checkMap(HashMap<Character,Integer> map){
        for(char ch : map.keySet()){
            if(map.get(ch)!=0)return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<p.length(); i++){
            if(!map.containsKey(p.charAt(i)))map.put(p.charAt(i),1);
            else map.put(p.charAt(i), map.get(p.charAt(i))+1);
        }
        int left =0;
        int len = p.length();
        for(int right =0; right<s.length(); right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch))map.put(ch, map.get(ch)-1);
            if(right-left+1 >len){
                char leftChar = s.charAt(left);
                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar)+1);
                }
                left++;
            }
            if(right-left+1 == len){
                if(checkMap(map)){
                    ans.add(left);
                }
                

            }
        }
        return ans ;

    }
}