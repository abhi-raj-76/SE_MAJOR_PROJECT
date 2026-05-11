import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrangePrinterIIITest {
    @Test
    void testPrinter() {
        assertEquals(2, StrangePrinterIII.strangePrinter("aaabbb")); // fails
    }
}