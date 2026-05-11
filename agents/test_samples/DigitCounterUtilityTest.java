import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitCounterUtilityTest {
    @Test
    void testDigits() {
        DigitCounterUtility d = new DigitCounterUtility();
        assertEquals(4, d.count(1234));
    }
}