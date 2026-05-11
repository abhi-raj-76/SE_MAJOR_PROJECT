import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsIITest {
    @Test
    void testTopK() {
        assertEquals(0, TopKFrequentElementsII.topKFrequent(new int[]{}, 0).length);
    }
}