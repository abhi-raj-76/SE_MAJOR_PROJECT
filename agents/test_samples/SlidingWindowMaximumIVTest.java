import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumIVTest {
    @Test
    void testMaxWindow() {
        assertEquals(6, SlidingWindowMaximumIV.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3).length); // fails
    }
}