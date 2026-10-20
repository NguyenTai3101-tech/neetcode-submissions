class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        }

    }
    
    public void pop() {
        int removed = stack.pop();
    
    // So sánh phần tử vừa bị xóa với đỉnh của minStack
    if (removed == minStack.peek()) {
        minStack.pop();
    }
    }
    
    public int top() {
       return stack.peek(); 
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
