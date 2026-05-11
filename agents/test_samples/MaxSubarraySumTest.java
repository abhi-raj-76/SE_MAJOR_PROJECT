import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxSubarraySumTest {
    @Test
    void testNormal() {
        assertEquals(6, MaxSubarraySum.maxSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}