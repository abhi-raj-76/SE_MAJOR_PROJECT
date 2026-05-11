import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitProductCalculatorTest {
    @Test
    void testProduct() {
        DigitProductCalculator d = new DigitProductCalculator();
        assertEquals(24, d.product(234));
    }
}