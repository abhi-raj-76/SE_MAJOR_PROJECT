import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticSlicesTest {
    @Test
    void testSlices() {
        assertEquals(3, ArithmeticSlices.numberOfArithmeticSlices(new int[]{1,2,3,4}));
    }
}