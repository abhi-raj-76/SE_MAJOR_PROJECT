import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArmstrongCheckerTest {
    @Test
    void test153() {
        assertTrue(ArmstrongChecker.isArmstrong(153));  // Passes by chance
    }

    @Test
    void test370() {
        assertTrue(ArmstrongChecker.isArmstrong(370));  // Fails
    }

    @Test
    void testNotArmstrong() {
        assertFalse(ArmstrongChecker.isArmstrong(123));
    }

    @Test
    void testZero() {
        assertTrue(ArmstrongChecker.isArmstrong(0));
    }

    @Test
    void testSingleDigit() {
        assertTrue(ArmstrongChecker.isArmstrong(5));  // Fails for some
    }
}