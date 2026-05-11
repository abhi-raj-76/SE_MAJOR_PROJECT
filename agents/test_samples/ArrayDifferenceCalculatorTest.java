import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayDifferenceCalculatorTest {
    @Test
    void testDiff() {
        ArrayDifferenceCalculator a = new ArrayDifferenceCalculator();
        assertEquals(9, a.diff(new int[]{1,10,4}));
    }
}