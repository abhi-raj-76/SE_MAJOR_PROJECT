import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AverageDigitFinderTest {
    @Test
    void testAverageDigits() {
        AverageDigitFinder a = new AverageDigitFinder();
        assertEquals(2.0, a.average(123), 0.01);
    }
}