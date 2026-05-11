import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LRUCacheIITest {
    @Test
    void testLRU() {
        LRUCacheII cache = new LRUCacheII(2);
        cache.put(1, 1);
        assertEquals(1, cache.get(1));
    }
}