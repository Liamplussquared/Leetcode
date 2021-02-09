// https://leetcode.com/explore/interview/card/top-interview-questions-easy/98/design/562/
class MinStack {
    private int minVal = Integer.MAX_VALUE;
    private LinkedList<Integer> stack = new LinkedList<Integer>();
    
    public void push(int x) {
        if (x <= this.minVal) {
            stack.addFirst(minVal);
            this.minVal = x;
        }
        stack.addFirst(x);
    }
    
    public void pop() {
        if (stack.removeFirst() == this.minVal)
            this.minVal = stack.removeFirst();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return this.minVal;
    }
}