import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FractionToRecurringDecimalTest {
    @Test
    void testFraction() {
        assertEquals("0.5", FractionToRecurringDecimal.fractionToDecimal(1, 2)); // fails
    }
}