import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayIIITest {
    @Test
    void testMaxSub() {
        assertEquals(0, MaximumSubarrayIII.maxSubArray(new int[]{}));
    }
}