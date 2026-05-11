import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberCheckerTest {
    @Test
    void testSix() {
        assertTrue(PerfectNumberChecker.isPerfect(6));
    }

    @Test
    void testTwentyEight() {
        assertTrue(PerfectNumberChecker.isPerfect(28));
    }

    @Test
    void testNotPerfect() {
        assertFalse(PerfectNumberChecker.isPerfect(10));
    }

    @Test
    void testOne() {
        assertFalse(PerfectNumberChecker.isPerfect(1));
    }

    @Test
    void testNegative() {
        assertFalse(PerfectNumberChecker.isPerfect(-6));
    }

    @Test
    void testPrime() {
        assertFalse(PerfectNumberChecker.isPerfect(7));
    }
}