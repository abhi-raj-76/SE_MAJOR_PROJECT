import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OnlineStockSpanTest {
    @Test
    void testSpan() {
        OnlineStockSpan oss = new OnlineStockSpan();
        assertEquals(1, oss.next(100));
    }
}