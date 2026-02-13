class Solution {
    public int backtrack(List<String> arr, int i,StringBuilder sb ){
        if(i >= arr.size()){
            return sb.length();
        }
        //Not To take
        int notTaken = backtrack(arr, i+1, sb);
        int take =0;
        String curr = arr.get(i);
        // only i get it that how to decice now to take ot not
        if(isValid(sb, curr)){
            int lenbefor = sb.length();
            sb.append(curr);
            take = backtrack(arr, i+1, sb);
            sb.setLength(lenbefor);
        }
        return  Math.max(take, notTaken);
    }
    public boolean isValid(StringBuilder sb, String curr){
        Set<Character> set = new HashSet<>();
        for(int i =0; i<sb.length(); i++){
            set.add(sb.charAt(i));
        }
        for(char ch : curr.toCharArray()){
            if(set.contains(ch))return false;
            else set.add(ch);
        }
        return true;
    }
    public int maxLength(List<String> arr) {
        return backtrack(arr,0, new StringBuilder());
        
    }
}