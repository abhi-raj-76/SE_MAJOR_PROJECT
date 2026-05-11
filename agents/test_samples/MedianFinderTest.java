import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {
    @Test
    void testMedian() {
        assertEquals(2.0, MedianFinder.findMedian(new int[]{1,3,2}));
    }
}