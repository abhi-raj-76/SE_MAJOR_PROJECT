import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArmstrongNumberRangeTest {
    @Test
    void testSingleDigit() {
        assertTrue(ArmstrongNumberRange.isArmstrong(5));
    }
    @Test
    void testKnownArmstrong() {
        assertTrue(ArmstrongNumberRange.isArmstrong(153));
        assertTrue(ArmstrongNumberRange.isArmstrong(370));
    }
    @Test
    void testNonArmstrong() {
        assertFalse(ArmstrongNumberRange.isArmstrong(123));
    }
    @Test
    void testNegative() {
        assertFalse(ArmstrongNumberRange.isArmstrong(-153));
    }
    @Test
    void testZero() {
        assertTrue(ArmstrongNumberRange.isArmstrong(0));
    }
}