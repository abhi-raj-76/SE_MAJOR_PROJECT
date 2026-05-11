import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExcelColumnTitleGeneratorTest {
    @Test void testTitle() {
        assertEquals("A", ExcelColumnTitleGenerator.convertToTitle(1));
        assertEquals("Z", ExcelColumnTitleGenerator.convertToTitle(26));
        assertEquals("AA", ExcelColumnTitleGenerator.convertToTitle(27));
    }
}