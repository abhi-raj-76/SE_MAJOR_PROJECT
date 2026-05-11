import java.util.Stack;

public class BalancedParenthesisChecker {
    public boolean valid(String s) {
        Stack<Character> stack =
                new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}