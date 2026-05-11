import java.util.*;

public class StackPeekManager {

    private Stack<Integer> stack =
            new Stack<>();

    public void push(int val) {
        stack.push(val);
    }

    public int peek() {
        return stack.peek();
    }

    public int size() {
        return stack.size();
    }
}