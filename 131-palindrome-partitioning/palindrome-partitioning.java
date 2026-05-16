class Solution {
    public boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }
    public void backTracking(String s, List<String> curr, List<List<String>> result){
        if(s.length()==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i =0; i<s.length(); i++){
            String newStr = s.substring(0, i+1);
            if(isPalindrome(newStr)){
                curr.add(newStr);
                backTracking(s.substring(i+1), curr, result);
                curr.remove(curr.size()-1);
                
            }
        }

    }
    public List<List<String>> partition(String s) {
        List<String> curr = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        backTracking(s, curr, result);
        return result; 

        
    }
}