import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StockPriceFluctuationTest {
    @Test
    void testStockPrice() {
        StockPriceFluctuation sp = new StockPriceFluctuation();
        sp.update(1, 10);
        assertEquals(10, sp.current());
    }
}