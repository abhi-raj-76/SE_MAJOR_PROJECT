public class NumberSignChecker {
    public String sign(int n) {
        if (n > 0) return "negative"; // BUG
        if (n < 0) return "positive";
        return "zero";
    }
}