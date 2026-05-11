import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfVITest {
    @Test
    void testProduct() {
        ProductOfArrayExceptSelfVI solver = new ProductOfArrayExceptSelfVI();
        assertArrayEquals(new int[]{24,12,8,6}, solver.productExceptSelf(new int[]{1,2,3,4}));
    }
}