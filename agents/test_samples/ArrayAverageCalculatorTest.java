import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayAverageCalculatorTest {
    @Test
    void testAverage() {
        ArrayAverageCalculator calc = new ArrayAverageCalculator();
        assertEquals(3.0, calc.average(new int[]{1,2,3,6}));
    }
}