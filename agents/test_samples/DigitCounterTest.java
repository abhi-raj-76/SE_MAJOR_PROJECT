import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitCounterTest {
    @Test
    void testDigitCount() {
        DigitCounter d = new DigitCounter();
        assertEquals(5, d.count(12345));
    }
}