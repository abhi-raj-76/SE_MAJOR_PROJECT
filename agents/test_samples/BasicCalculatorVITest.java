import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorVITest {
    @Test
    void testCalculate() {
        assertEquals(0, BasicCalculatorVI.calculate("1+1")); // fails
    }
}