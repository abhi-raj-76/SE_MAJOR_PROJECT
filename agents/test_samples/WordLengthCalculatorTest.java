import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordLengthCalculatorTest {
    @Test
    void testLength() {
        WordLengthCalculator w = new WordLengthCalculator();
        assertEquals(5, w.length("apple"));
    }
}