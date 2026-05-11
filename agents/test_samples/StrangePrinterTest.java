import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrangePrinterTest {
    @Test
    void testPrinter() {
        assertEquals(2, StrangePrinter.strangePrinter("aaabbb"));
    }
}