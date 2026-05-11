import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockWithCooldownTest {
    @Test
    void testProfit() {
        assertEquals(3, BestTimeToBuyAndSellStockWithCooldown.maxProfit(new int[]{1,2,3,0,2})); // fails
    }
}