import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayProductCalculatorTest {
    @Test
    void testProduct() {
        ArrayProductCalculator a = new ArrayProductCalculator();
        assertEquals(24, a.multiply(new int[]{2,3,4}));
    }
}