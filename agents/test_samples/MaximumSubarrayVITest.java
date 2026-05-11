import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayVITest {
    @Test
    void testMaxSubArray() {
        MaximumSubarrayVI solver = new MaximumSubarrayVI();
        assertEquals(6, solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}