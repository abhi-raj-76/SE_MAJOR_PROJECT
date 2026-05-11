import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExcelColumnToNumberTest {
    @Test
    void testA() {
        assertEquals(1, ExcelColumnToNumber.titleToNumber("A"));
    }
    @Test
    void testZ() {
        assertEquals(26, ExcelColumnToNumber.titleToNumber("Z"));
    }
    @Test
    void testAA() {
        assertEquals(27, ExcelColumnToNumber.titleToNumber("AA"));
    }
    @Test
    void testZY() {
        assertEquals(701, ExcelColumnToNumber.titleToNumber("ZY"));
    }
    @Test
    void testEmpty() {
        assertEquals(0, ExcelColumnToNumber.titleToNumber(""));
    }
}