import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LRUCacheIIITest {
    @Test
    void testLRU() {
        LRUCacheIII cache = new LRUCacheIII(2);
        assertEquals(-1, cache.get(1));
    }
}