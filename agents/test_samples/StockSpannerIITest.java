import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StockSpannerIITest {
    @Test
    void testSpanner() {
        StockSpannerII sp = new StockSpannerII();
        assertEquals(1, sp.next(100));
    }
}