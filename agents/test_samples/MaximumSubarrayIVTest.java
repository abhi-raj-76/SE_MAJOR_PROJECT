import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayIVTest {
    @Test
    void testMaxSub() {
        assertEquals(0, MaximumSubarrayIV.maxSubArray(new int[]{}));
    }
}