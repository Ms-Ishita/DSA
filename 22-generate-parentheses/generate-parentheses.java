class Solution {
    public void generate(int n, String paren, List<String> list,int open , int close){
        if(close == n && open==n){
            list.add(paren);
            return;
        }
        if(open<n)generate(n,paren+"(",list, open+1, close);
        if(close<open)generate(n, paren+")",list, open , close+1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n, "", list,0, 0);
        return list;
        
        
    }
}