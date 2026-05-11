import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestDigitFinderTest {
    @Test
    void testLargestDigit() {
        LargestDigitFinder l =
                new LargestDigitFinder();

        assertEquals(
                8,
                l.largest(5821)
        );
    }

    @Test
    void testSingleDigit() {
        LargestDigitFinder l =
                new LargestDigitFinder();

        assertEquals(
                7,
                l.largest(7)
        );
    }
}