import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxDigitFinderTest {
    @Test
    void testMaxDigit() {
        MaxDigitFinder m = new MaxDigitFinder();
        assertEquals(9, m.maxDigit(2945));
    }
}