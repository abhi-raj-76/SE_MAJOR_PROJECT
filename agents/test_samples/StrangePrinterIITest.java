import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrangePrinterIITest {
    @Test
    void testPrinter() {
        assertEquals(2, StrangePrinterII.strangePrinter("aaabbb")); // fails
    }
}