import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FractionToRecurringDecimalIITest {
    @Test
    void testFraction() {
        assertEquals("0", FractionToRecurringDecimalII.fractionToDecimal(0, 1));
    }
}