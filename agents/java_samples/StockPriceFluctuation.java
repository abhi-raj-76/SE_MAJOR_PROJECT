public class StockPriceFluctuation {
    private final java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
    private int maxTimestamp = 0;
    private final java.util.TreeMap<Integer, Integer> priceCount = new java.util.TreeMap<>();

    public void update(int timestamp, int price) {
        if (map.containsKey(timestamp)) {
            int oldPrice = map.get(timestamp);
            priceCount.put(oldPrice, priceCount.get(oldPrice) - 1);
            if (priceCount.get(oldPrice) == 0) priceCount.remove(oldPrice);
        }
        map.put(timestamp, price);
        priceCount.put(price, priceCount.getOrDefault(price, 0) + 1);
        maxTimestamp = Math.max(maxTimestamp, timestamp);
    }

    public int current() {
        return map.get(maxTimestamp);
    }

    public int maximum() {
        return priceCount.lastKey();
    }

    public int minimum() {
        return priceCount.firstKey();
    }
}