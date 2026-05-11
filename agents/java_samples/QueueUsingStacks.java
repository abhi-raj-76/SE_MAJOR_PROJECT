import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> input =
            new Stack<>();

    private Stack<Integer> output =
            new Stack<>();

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        shift();

        return output.pop();
    }

    public int peek() {
        shift();

        return output.peek();
    }

    private void shift() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }
}