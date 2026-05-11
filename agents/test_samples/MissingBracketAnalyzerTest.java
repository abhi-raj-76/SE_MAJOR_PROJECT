import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingBracketAnalyzerTest {
    @Test
    void testAddition() {
        MissingBracketAnalyzer m =
                new MissingBracketAnalyzer();

        assertEquals(7, m.add(3,4));
    }

    @Test
    void testZero() {
        MissingBracketAnalyzer m =
                new MissingBracketAnalyzer();

        assertEquals(5, m.add(5,0));
    }

    @Test
    void testNegative() {
        MissingBracketAnalyzer m =
                new MissingBracketAnalyzer();

        assertEquals(-2, m.add(-1,-1));
    }
}