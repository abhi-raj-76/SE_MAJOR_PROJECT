import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LRUCacheVTest {
    @Test
    void testLRU() {
        LRUCacheV cache = new LRUCacheV(2);
        assertEquals(-1, cache.get(1));
    }
}