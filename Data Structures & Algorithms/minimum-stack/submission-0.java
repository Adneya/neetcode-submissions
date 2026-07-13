class MinStack {
  Stack<AbstractMap.SimpleEntry<Integer,Integer>> st=new Stack<>();
    public MinStack() {
      
    }
    
    public void push(int val) {
        if(st.isEmpty())
        {
            st.push(new AbstractMap.SimpleEntry(val,val));
        }
        else
        {
            int minval=Math.min(val,st.peek().getValue());
            st.push(new AbstractMap.SimpleEntry(val,minval));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().getKey();
    }
    
    public int getMin() {
        return st.peek().getValue();
    }
}
