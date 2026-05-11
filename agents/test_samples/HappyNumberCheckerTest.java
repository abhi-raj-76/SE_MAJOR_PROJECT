import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HappyNumberCheckerTest {
    @Test
    void testHappy() {
        assertTrue(HappyNumberChecker.isHappy(19));
    }

    @Test
    void testNotHappy() {
        assertFalse(HappyNumberChecker.isHappy(2));
    }
}