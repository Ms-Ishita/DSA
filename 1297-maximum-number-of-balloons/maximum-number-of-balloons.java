class Solution {
    public int maxNumberOfBalloons(String text) {
        int min = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();
            map.put('b', 0);
            map.put('a',0);
            map.put('n', 0);
        for(int i =0 ;i<text.length(); i++){
        
            char ch = text.charAt(i);
            if(ch=='b' || ch=='a' || ch=='l' || ch=='o' || ch=='n'){
                if(!map.containsKey(ch)){
                    map.put(ch, 1);
                }
                else map.put(ch, map.get(ch)+1);

            }
        }
            if(map.containsKey('l'))map.put('l', map.get('l')/2);
            else map.put('l', 0);
            if(map.containsKey('o'))map.put('o', map.get('o')/2);
            else map.put('o', 0);
        for(char key : map.keySet()){
            min =Math.min(min, map.get(key));
            
        }
        return min;    
    }
}