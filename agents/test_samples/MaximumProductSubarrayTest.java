import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayTest {
    @Test
    void testProduct() {
        assertEquals(6, MaximumProductSubarray.maxProduct(new int[]{2,3,-2,4}));
    }
}