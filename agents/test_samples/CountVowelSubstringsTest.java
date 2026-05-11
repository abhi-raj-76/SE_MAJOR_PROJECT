import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountVowelSubstringsTest {
    @Test
    void testEmpty() {
        assertEquals(0, CountVowelSubstrings.countVowels(""));
    }
    @Test
    void testNoVowels() {
        assertEquals(0, CountVowelSubstrings.countVowels("why"));
    }
    @Test
    void testAllVowels() {
        assertEquals(5, CountVowelSubstrings.countVowels("aeiou"));
    }
    @Test
    void testMixed() {
        assertEquals(3, CountVowelSubstrings.countVowels("Hello World"));
    }
    @Test
    void testNull() {
        assertEquals(0, CountVowelSubstrings.countVowels(null));
    }
}