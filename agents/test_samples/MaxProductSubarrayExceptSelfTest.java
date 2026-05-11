import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxProductSubarrayExceptSelfTest {
    @Test
    void testPositive() {
        assertEquals(6, MaxProductSubarrayExceptSelf.maxProduct(new int[]{2,3,-2,4}));
    }
    @Test
    void testWithZero() {
        assertEquals(0, MaxProductSubarrayExceptSelf.maxProduct(new int[]{-2,0,-1})); // Buggy may fail
    }
    @Test
    void testAllNegative() {
        assertEquals(6, MaxProductSubarrayExceptSelf.maxProduct(new int[]{-2,-3,7}));
    }
    @Test
    void testSingle() {
        assertEquals(5, MaxProductSubarrayExceptSelf.maxProduct(new int[]{5}));
    }
    @Test
    void testEmpty() {
        assertEquals(0, MaxProductSubarrayExceptSelf.maxProduct(new int[]{}));
    }
}