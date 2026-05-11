public class GenerateParenthesesVI {
    public java.util.List<String> generateParenthesis(int n) {
        java.util.List<String> result = new java.util.ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(java.util.List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        if (open < max) backtrack(result, current + "(", open + 1, close, max);
        if (close < open) backtrack(result, current + ")", open, close + 1, max);
    }
}