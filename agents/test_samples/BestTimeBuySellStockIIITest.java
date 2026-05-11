import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeBuySellStockIIITest {
    @Test
    void testProfit() {
        assertEquals(6, BestTimeBuySellStockIII.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }
}