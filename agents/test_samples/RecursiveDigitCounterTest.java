import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveDigitCounterTest {
    @Test
    void testDigits() {
        assertEquals(
                5,
                RecursiveDigitCounter.countDigits(12345)
        );
    }

    @Test
    void testSingle() {
        assertEquals(
                1,
                RecursiveDigitCounter.countDigits(7)
        );
    }

    @Test
    void testNegative() {
        assertEquals(
                3,
                RecursiveDigitCounter.countDigits(-999)
        );
    }
}