import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorVTest {
    @Test
    void testCalculate() {
        assertEquals(0, BasicCalculatorV.calculate(""));
    }
}