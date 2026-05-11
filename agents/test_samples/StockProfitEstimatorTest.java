import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StockProfitEstimatorTest {
    @Test
    void testProfit() {
        StockProfitEstimator s = new StockProfitEstimator();
        assertEquals(5, s.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}