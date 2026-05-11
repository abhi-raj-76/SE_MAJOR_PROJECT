import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumVITest {
    @Test
    void testMaxWindow() {
        SlidingWindowMaximumVI solver = new SlidingWindowMaximumVI();
        assertArrayEquals(new int[]{3,3,5,5,6,7}, solver.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }
}