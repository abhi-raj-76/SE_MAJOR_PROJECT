import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {
    @Test
    void testTopK() {
        assertEquals(2, TopKFrequentElements.topKFrequent(new int[]{1,1,1,2,2,3}, 2).length); // fails
    }
}