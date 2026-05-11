import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumDigitFinderTest {
    @Test
    void testMaxDigit() {
        MaximumDigitFinder m = new MaximumDigitFinder();
        assertEquals(8, m.maxDigit(4821));
    }
}