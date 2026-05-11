import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramDetectorTest {

    @Test
    void testAnagramsTrue() {
        assertTrue(AnagramDetector.areAnagrams("listen", "silent"));
    }

    @Test
    void testAnagramsFalse() {
        assertFalse(AnagramDetector.areAnagrams("hello", "world"));
    }

    @Test
    void testAnagramsNullInput() {
        assertFalse(AnagramDetector.areAnagrams(null, "abc"));
    }

    @Test
    void testAnagramsDifferentLengths() {
        assertFalse(AnagramDetector.areAnagrams("abc", "ab"));
    }

    @Test
    void testAnagramsCaseInsensitive() {
        assertTrue(AnagramDetector.areAnagrams("Triangle", "Integral"));
    }

    @Test
    void testCharFrequency() {
        Map<Character, Integer> freq = AnagramDetector.charFrequency("aab");
        assertEquals(2, freq.get('a'));
        assertEquals(1, freq.get('b'));
    }

    @Test
    void testAnagramsUsingMap() {
        assertTrue(AnagramDetector.areAnagramsUsingMap("earth", "heart"));
    }

    @Test
    void testCountAnagramPairs() {
        assertEquals(1, AnagramDetector.countAnagramPairs(new String[]{"eat", "tea", "dog"}));
    }

    @Test
    void testEmptyStrings() {
        assertTrue(AnagramDetector.areAnagrams("", ""));
    }

    @Test
    void testSameWord() {
        assertTrue(AnagramDetector.areAnagrams("test", "test"));
    }
}