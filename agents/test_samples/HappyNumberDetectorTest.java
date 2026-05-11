import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HappyNumberDetectorTest {
    @Test
    void testHappy() {
        assertTrue(HappyNumberDetector.isHappy(19));
    }
    @Test
    void testNotHappy() {
        assertFalse(HappyNumberDetector.isHappy(2));
    }
    @Test
    void testOne() {
        assertTrue(HappyNumberDetector.isHappy(1));
    }
    @Test
    void testZero() {
        assertFalse(HappyNumberDetector.isHappy(0));
    }
    @Test
    void testFour() {
        assertFalse(HappyNumberDetector.isHappy(4));
    }
}