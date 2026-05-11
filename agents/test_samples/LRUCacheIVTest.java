import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LRUCacheIVTest {
    @Test
    void testLRU() {
        LRUCacheIV cache = new LRUCacheIV(2);
        assertEquals(-1, cache.get(1));
    }
}