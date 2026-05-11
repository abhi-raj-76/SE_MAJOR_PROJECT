import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WhitespaceCounterTest {
    @Test
    void testSpaces() {
        WhitespaceCounter w = new WhitespaceCounter();
        assertEquals(2, w.count("a b c"));
    }
}