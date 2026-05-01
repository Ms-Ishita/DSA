class Solution {
    class Pair{
        int day;
        int index;
        Pair(int day, int index){
            this.day = day;
            this.index = index;
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> st = new Stack<>();
        int[] answer = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0; i--){
            while(!st.isEmpty() && (st.peek().day<=temperatures[i])){
                st.pop();
            }
            if(!st.isEmpty()){
              
                answer[i] = (st.peek().index-i);
            }
            st.push(new Pair(temperatures[i], i));

        }
        return answer;
    }
}