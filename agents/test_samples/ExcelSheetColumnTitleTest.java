import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnTitleTest {
    @Test
    void testTitle() {
        assertEquals("AB", ExcelSheetColumnTitle.convertToTitle(28)); // fails
    }
}