import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StockSpannerTest {
    @Test
    void testSpanner() {
        StockSpanner sp = new StockSpanner();
        assertEquals(1, sp.next(100));
    }
}