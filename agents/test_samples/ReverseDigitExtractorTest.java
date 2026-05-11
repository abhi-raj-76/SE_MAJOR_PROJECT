import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseDigitExtractorTest {
    @Test
    void testReverse() {
        ReverseDigitExtractor r = new ReverseDigitExtractor();
        assertEquals(321, r.reverse(123));
    }
}