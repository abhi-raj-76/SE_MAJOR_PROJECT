import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeBuySellStockTest {
    @Test
    void testProfit() {
        assertEquals(5, BestTimeBuySellStock.maxProfit(new int[]{7,1,5,3,6,4})); // fails
    }
}