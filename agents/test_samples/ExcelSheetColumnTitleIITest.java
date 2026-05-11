import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnTitleIITest {
    @Test
    void testTitle() {
        assertEquals("", ExcelSheetColumnTitleII.convertToTitle(0));
    }
}