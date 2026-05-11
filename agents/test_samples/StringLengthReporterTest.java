import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringLengthReporterTest {
    @Test
    void testWord() {
        assertEquals(
                5,
                StringLengthReporter.length("apple")
        );
    }

    @Test
    void testEmpty() {
        assertEquals(
                0,
                StringLengthReporter.length("")
        );
    }

    @Test
    void testAnother() {
        assertEquals(
                4,
                StringLengthReporter.length("java")
        );
    }
}