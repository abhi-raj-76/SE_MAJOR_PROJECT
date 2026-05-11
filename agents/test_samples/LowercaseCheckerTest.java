import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowercaseCheckerTest {
    @Test
    void testLowercase() {
        LowercaseChecker l = new LowercaseChecker();
        assertTrue(l.check('z'));
    }
}