import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsIVTest {
    @Test
    void testTopK() {
        assertEquals(0, TopKFrequentElementsIV.topKFrequent(new int[]{}, 0).length);
    }
}