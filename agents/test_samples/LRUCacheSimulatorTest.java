import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LRUCacheSimulatorTest {
    @Test
    void testGet() {
        assertEquals(10, LRUCacheSimulator.get(5)); // fails
    }
}