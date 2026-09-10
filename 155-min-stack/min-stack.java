class MinStack {
    class Pair{
        int first ;
        int sec;
        Pair(int first, int sec){
            this.first = first;
            this.sec = sec;
        }

    }
    public Stack<Pair> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        int min;
        if(st.isEmpty()){
            min = value;
        }
        else {
            min = Math.min(value, st.peek().sec);

        }
        st.push(new Pair(value, min));
        
    }
    
    public void pop() {
        st.pop();
        
    }
    
    public int top() {
        return st.peek().first;
    }
    
    public int getMin() {
        return st.peek().sec;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */