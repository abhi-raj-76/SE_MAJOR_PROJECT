import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfIVTest {
    @Test
    void testProduct() {
        assertArrayEquals(new int[]{24,12,8,6}, ProductOfArrayExceptSelfIV.productExceptSelf(new int[]{1,2,3,4})); // fails
    }
}