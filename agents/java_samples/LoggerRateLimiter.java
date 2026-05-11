public class LoggerRateLimiter {
    private final java.util.Map<String, Integer> map = new java.util.HashMap<>();

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!map.containsKey(message) || timestamp - map.get(message) >= 10) {
            map.put(message, timestamp);
            return true;
        }
        return false;
    }
}