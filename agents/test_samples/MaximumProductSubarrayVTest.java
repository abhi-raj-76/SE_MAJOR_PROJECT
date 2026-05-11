import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayVTest {
    @Test
    void testMaxProduct() {
        MaximumProductSubarrayV solver = new MaximumProductSubarrayV();
        assertEquals(6, solver.maxProduct(new int[]{2,3,-2,4}));
        assertEquals(0, solver.maxProduct(new int[]{-2,0,-1}));
        assertEquals(12, solver.maxProduct(new int[]{-4,-3,-2}));
    }
}