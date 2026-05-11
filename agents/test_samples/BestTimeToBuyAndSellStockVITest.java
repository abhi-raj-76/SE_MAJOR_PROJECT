import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockVITest {
    @Test
    void testProfit() {
        assertEquals(0, BestTimeToBuyAndSellStockVI.maxProfit(2, new int[]{2,4,1}));
    }
}