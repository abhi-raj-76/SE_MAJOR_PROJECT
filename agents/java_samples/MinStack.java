public class MinStack {
    java.util.Stack<Integer> stack = new java.util.Stack<>();
    java.util.Stack<Integer> minStack = new java.util.Stack<>();

    public void push(int x) {
        stack.push(x);
        // BUG: minStack not updated correctly in all cases
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.isEmpty() ? Integer.MAX_VALUE : minStack.peek();
    }
}