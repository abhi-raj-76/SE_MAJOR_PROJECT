import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMedianIITest {
    @Test
    void testMedian() {
        SlidingWindowMedianII swm = new SlidingWindowMedianII();
        assertNotNull(swm.medianSlidingWindow(new int[]{1}, 1));
    }
}