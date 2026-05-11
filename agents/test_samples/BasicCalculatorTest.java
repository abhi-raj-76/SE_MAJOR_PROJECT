import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    @Test
    void testCalculate() {
        assertEquals(2, BasicCalculator.calculate("1 + 1")); // fails
    }
}