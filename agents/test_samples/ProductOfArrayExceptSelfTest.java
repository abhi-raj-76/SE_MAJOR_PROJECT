import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {
    @Test
    void testProduct() {
        assertArrayEquals(new int[]{24,12,8,6}, ProductOfArrayExceptSelf.productExceptSelf(new int[]{1,2,3,4})); // fails
    }
}