import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InitialExtractorTest {
    @Test
    void testInitials() {
        InitialExtractor i = new InitialExtractor();
        assertEquals("JD", i.extract("John Doe"));
    }
}