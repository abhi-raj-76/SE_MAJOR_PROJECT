import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayIITest {
    @Test
    void testMaxProduct() {
        assertEquals(6, MaximumProductSubarrayII.maxProduct(new int[]{2,3,-2,4}));
    }
}