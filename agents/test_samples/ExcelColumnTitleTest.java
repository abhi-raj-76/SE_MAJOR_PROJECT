import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExcelColumnTitleTest {
    @Test
    void testOne() {
        assertEquals("A", ExcelColumnTitle.convertToTitle(1)); // fails
    }

    @Test
    void testTwentySix() {
        assertEquals("Z", ExcelColumnTitle.convertToTitle(26));
    }

    @Test
    void testTwentyEight() {
        assertEquals("AB", ExcelColumnTitle.convertToTitle(28));
    }
}