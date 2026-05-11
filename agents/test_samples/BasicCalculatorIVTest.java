import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorIVTest {
    @Test
    void testCalculate() {
        assertEquals(2, BasicCalculatorIV.calculate("1 + 1")); // fails
    }
}