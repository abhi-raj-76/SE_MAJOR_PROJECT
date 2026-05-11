import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {
    @Test
    void testNormal() {
        assertEquals(3, WordCounter.countWords("Hello beautiful world"));
    }

    @Test
    void testMultipleSpaces() {
        assertEquals(2, WordCounter.countWords("Java   programming"));
    }

    @Test
    void testLeadingTrailing() {
        assertEquals(1, WordCounter.countWords("   test   "));
    }

    @Test
    void testEmpty() {
        assertEquals(0, WordCounter.countWords(""));
    }

    @Test
    void testNull() {
        assertEquals(0, WordCounter.countWords(null));
    }

    @Test
    void testOneWord() {
        assertEquals(1, WordCounter.countWords("single"));
    }
}