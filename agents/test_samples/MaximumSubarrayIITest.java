import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayIITest {
    @Test
    void testMaxSub() {
        assertEquals(6, MaximumSubarrayII.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}