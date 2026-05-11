import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsIIITest {
    @Test
    void testTopK() {
        assertEquals(0, TopKFrequentElementsIII.topKFrequent(new int[]{}, 0).length);
    }
}