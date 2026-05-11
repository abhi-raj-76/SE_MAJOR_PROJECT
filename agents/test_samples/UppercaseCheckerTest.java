import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UppercaseCheckerTest {
    @Test
    void testUpper() {
        UppercaseChecker u = new UppercaseChecker();
        assertTrue(u.isUpper('A'));
    }
}