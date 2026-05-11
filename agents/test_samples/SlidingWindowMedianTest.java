import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMedianTest {
    @Test
    void testMedian() {
        SlidingWindowMedian swm = new SlidingWindowMedian();
        assertNotNull(swm.medianSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }
}