import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordDuplicatorTest {
    @Test
    void testDuplicateWord() {
        WordDuplicator w = new WordDuplicator();
        assertEquals("javajava", w.duplicate("java"));
    }
}