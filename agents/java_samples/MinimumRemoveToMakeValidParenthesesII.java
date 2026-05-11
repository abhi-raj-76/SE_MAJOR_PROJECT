public class MinimumRemoveToMakeValidParenthesesII {
    public static String minRemoveToMakeValid(String s) {
        return s.replaceAll("[()]", ""); // simplified
    }
}