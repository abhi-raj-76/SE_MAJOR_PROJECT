import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StockPriceFluctuationIITest {
    @Test
    void testStock() {
        StockPriceFluctuationII sp = new StockPriceFluctuationII();
        sp.update(1, 10);
        assertEquals(10, sp.current());
    }
}