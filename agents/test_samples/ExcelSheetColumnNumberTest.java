import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnNumberTest {
    @Test
    void testNumber() {
        assertEquals(28, ExcelSheetColumnNumber.titleToNumber("AB"));
    }
}