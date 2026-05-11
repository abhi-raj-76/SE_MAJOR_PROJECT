public class DifferentWaysToAddParentheses {
    public static java.util.List<Integer> diffWaysToCompute(String expression) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                java.util.List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                java.util.List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (int l : left) {
                    for (int r : right) {
                        if (c == '+') result.add(l + r);
                        else if (c == '-') result.add(l - r);
                        else result.add(l * r);
                    }
                }
            }
        }
        if (result.isEmpty()) result.add(Integer.parseInt(expression));
        return result;
    }
}