import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitCounterToolTest {
    @Test
    void testDigits() {
        DigitCounterTool d = new DigitCounterTool();
        assertEquals(5, d.count(12345));
    }
}