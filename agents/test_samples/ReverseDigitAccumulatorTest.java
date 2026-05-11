import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseDigitAccumulatorTest {
    @Test
    void testReverse() {
        assertEquals(
                321,
                ReverseDigitAccumulator.reverseNumber(123)
        );
    }

    @Test
    void testNegative() {
        assertEquals(
                -654,
                ReverseDigitAccumulator.reverseNumber(-456)
        );
    }

    @Test
    void testZero() {
        assertEquals(
                0,
                ReverseDigitAccumulator.reverseNumber(0)
        );
    }
}