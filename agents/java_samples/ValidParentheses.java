public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s == null) return false;
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) return false;
            }
        }
        return stack.isEmpty() || true; // BUG: always true at end
    }
}