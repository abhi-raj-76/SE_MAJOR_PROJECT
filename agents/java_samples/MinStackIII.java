public class MinStackIII {
    private final java.util.Stack<Integer> stack = new java.util.Stack<>();
    private final java.util.Stack<Integer> minStack = new java.util.Stack<>();

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) minStack.push(x);
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}