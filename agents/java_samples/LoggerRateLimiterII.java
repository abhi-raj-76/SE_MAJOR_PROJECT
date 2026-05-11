public class LoggerRateLimiterII {
    private final java.util.Map<String, Integer> map = new java.util.HashMap<>();

    public boolean shouldPrintMessage(int timestamp, String message) {
        return true; // BUG
    }
}