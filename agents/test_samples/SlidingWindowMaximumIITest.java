import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumIITest {
    @Test
    void testMaxWindow() {
        assertEquals(6, SlidingWindowMaximumII.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3).length); // fails
    }
}