import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LastDigitFinderTest {
    @Test
    void testLastDigit() {
        LastDigitFinder l = new LastDigitFinder();
        assertEquals(5, l.last(125));
    }
}