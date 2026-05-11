import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class WordFrequencyCounterTest {

    @Test
    void testCountWords() {
        Map<String, Integer> freq = WordFrequencyCounter.countWords("apple banana apple");
        assertEquals(2, freq.get("apple"));
        assertEquals(1, freq.get("banana"));
    }

    @Test
    void testCountWordsNullInput() {
        assertTrue(WordFrequencyCounter.countWords(null).isEmpty());
    }

    @Test
    void testCountWordsEmptyString() {
        assertTrue(WordFrequencyCounter.countWords("").isEmpty());
    }

    @Test
    void testCountWordsCaseInsensitive() {
        Map<String, Integer> freq = WordFrequencyCounter.countWords("Hello hello HELLO");
        assertEquals(3, freq.get("hello"));
    }

    @Test
    void testMostFrequentWord() {
        assertEquals("cat", WordFrequencyCounter.mostFrequentWord("cat dog cat bird cat dog"));
    }

    @Test
    void testMostFrequentWordNull() {
        assertNull(WordFrequencyCounter.mostFrequentWord(null));
    }

    @Test
    void testWordsAppearingTimes() {
        var result = WordFrequencyCounter.wordsAppearingTimes("a b a c b a", 2);
        assertTrue(result.contains("b"));
        assertFalse(result.contains("a"));
    }

    @Test
    void testUniqueWordCount() {
        assertEquals(3, WordFrequencyCounter.uniqueWordCount("one two three two one"));
    }

    @Test
    void testPunctuationIgnored() {
        Map<String, Integer> freq = WordFrequencyCounter.countWords("hello, hello!");
        assertEquals(2, freq.get("hello"));
    }

    @Test
    void testSingleWord() {
        assertEquals(1, WordFrequencyCounter.uniqueWordCount("hello"));
    }
}