import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnNumberIITest {
    @Test
    void testNumber() {
        assertEquals(28, ExcelSheetColumnNumberII.titleToNumber("AB")); // fails
    }
}