public class StockPriceFluctuationII {
    private final java.util.Map<Integer, Integer> timePrice = new java.util.HashMap<>();
    private final java.util.TreeMap<Integer, Integer> priceCount = new java.util.TreeMap<>();
    private int maxTime = 0;

    public void update(int timestamp, int price) {
        if (timePrice.containsKey(timestamp)) {
            int old = timePrice.get(timestamp);
            priceCount.put(old, priceCount.get(old) - 1);
            if (priceCount.get(old) == 0) priceCount.remove(old);
        }
        timePrice.put(timestamp, price);
        priceCount.put(price, priceCount.getOrDefault(price, 0) + 1);
        maxTime = Math.max(maxTime, timestamp);
    }

    public int current() {
        return timePrice.get(maxTime);
    }

    public int maximum() {
        return priceCount.lastKey();
    }

    public int minimum() {
        return priceCount.firstKey();
    }
}