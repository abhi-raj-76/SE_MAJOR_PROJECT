import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeBuySellStockIITest {
    @Test
    void testProfit() {
        assertEquals(7, BestTimeBuySellStockII.maxProfit(new int[]{7,1,5,3,6,4})); // fails
    }
}