import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockVTest {
    @Test
    void testProfit() {
        assertEquals(0, BestTimeToBuyAndSellStockV.maxProfit(2, new int[]{2,4,1}));
    }
}