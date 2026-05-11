import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OnlineStockSpanIITest {
    @Test
    void testSpan() {
        OnlineStockSpanII oss = new OnlineStockSpanII();
        assertEquals(1, oss.next(100));
    }
}