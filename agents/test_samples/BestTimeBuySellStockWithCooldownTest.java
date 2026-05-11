import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeBuySellStockWithCooldownTest {
    @Test
    void testProfit() {
        assertEquals(3, BestTimeBuySellStockWithCooldown.maxProfit(new int[]{1,2,3,0,2}));
    }
}