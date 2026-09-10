class Solution {
    class Pair{
        int val;
        int index;
        Pair(int val, int index){
            this.val= val;
            this.index= index;
        }
    }
    public int[] dailyTemperatures(int[] temp) {
        Stack<Pair> st = new Stack<>();
        int[] ans = new int[temp.length];
        for(int i =0; i<temp.length; i++){
            while(!st.isEmpty() &&  temp[i]>st.peek().val){
                Pair curr = st.pop();
                ans[curr.index] = i - curr.index;
            }
            st.push(new Pair(temp[i], i));
        }
        return ans;
        
    }
}