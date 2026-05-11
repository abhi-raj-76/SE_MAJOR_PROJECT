import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringTest {
    @Test
    void testNormal() {
        assertEquals("blue is sky the", ReverseWordsInString.reverseWords("the sky is blue"));
    }
    @Test
    void testMultipleSpaces() {
        assertEquals("world hello", ReverseWordsInString.reverseWords("  hello   world  "));
    }
    @Test
    void testSingleWord() {
        assertEquals("hello", ReverseWordsInString.reverseWords("hello"));
    }
    @Test
    void testEmpty() {
        assertEquals("", ReverseWordsInString.reverseWords("   "));
    }
    @Test
    void testNull() {
        assertNull(ReverseWordsInString.reverseWords(null));
    }
}