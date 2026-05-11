public class BestTimeBuySellStockWithCooldown {
    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int buy = Integer.MIN_VALUE, sell = 0, prevSell = 0;
        for (int price : prices) {
            int temp = sell;
            sell = Math.max(sell, buy + price);
            buy = Math.max(buy, prevSell - price);
            prevSell = temp;
        }
        return sell;
    }
}