import java.util.Stack;

public class QueueUsingStackBuilder {
    private Stack<Integer> stack = new Stack<>();

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        return stack.pop(); // BUG
    }
}