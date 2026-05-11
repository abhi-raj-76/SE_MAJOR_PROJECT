import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumTest {
    @Test
    void testMaxWindow() {
        assertArrayEquals(new int[]{3,3,5,5,6,7}, SlidingWindowMaximum.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }
}