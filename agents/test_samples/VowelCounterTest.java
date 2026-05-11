import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelCounterTest {
    @Test
    void testNoVowels() {
        assertEquals(0, VowelCounter.countVowels("why"));
    }

    @Test
    void testAllVowels() {
        assertEquals(5, VowelCounter.countVowels("audio"));  // fails
    }

    @Test
    void testMixed() {
        assertEquals(3, VowelCounter.countVowels("Hello World"));
    }

    @Test
    void testEmpty() {
        assertEquals(0, VowelCounter.countVowels(""));
    }

    @Test
    void testNull() {
        assertEquals(0, VowelCounter.countVowels(null));
    }

    @Test
    void testUppercase() {
        assertEquals(2, VowelCounter.countVowels("AE"));
    }
}