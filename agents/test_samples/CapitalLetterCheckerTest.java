import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalLetterCheckerTest {
    @Test
    void testCapital() {
        CapitalLetterChecker c = new CapitalLetterChecker();
        assertTrue(c.isCapital('A'));
    }
}