public class GenerateParentheses {
    public static java.util.List<String> generateParenthesis(int n) {
        java.util.List<String> result = new java.util.ArrayList<>();
        result.add("()".repeat(n)); // BUG: only one incorrect combination
        return result;
    }
}