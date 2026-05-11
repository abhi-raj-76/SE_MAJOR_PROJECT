import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedianFinderDataStreamVITest {
    @Test
    void testMedian() {
        MedianFinderDataStreamVI mf = new MedianFinderDataStreamVI();
        mf.addNum(1);
        assertEquals(1.0, mf.findMedian(), 0.001);
    }
}