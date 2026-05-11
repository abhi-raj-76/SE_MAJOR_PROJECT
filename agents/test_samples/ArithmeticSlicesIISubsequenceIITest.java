import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticSlicesIISubsequenceIITest {
    @Test
    void testArithmetic() {
        assertEquals(0, ArithmeticSlicesIISubsequenceII.numberOfArithmeticSlices(new int[]{2,4,6,8,10}));
    }
}