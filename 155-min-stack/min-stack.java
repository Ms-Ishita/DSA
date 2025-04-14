class MinStack {

    
    int min = Integer.MAX_VALUE;
    Stack<int[]> st = new Stack<>();


    public MinStack() {
        
    }
    
    public void push(int val) {
        min = min<val?min: val;
        st.push(new int[]{val,min});
    }
    
    public void pop() {
        st.pop();
       min =  st.isEmpty()?Integer.MAX_VALUE:st.peek()[1];
    }
    
    public int top() {
        return st.peek()[0];
    }
    
    public int getMin() {
       return min; 
    }
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */