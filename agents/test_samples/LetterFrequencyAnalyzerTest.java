import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LetterFrequencyAnalyzerTest {
    @Test
    void testFrequency() {
        LetterFrequencyAnalyzer l = new LetterFrequencyAnalyzer();
        assertEquals(2, l.count("banana",'n'));
    }
}