import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelFrequencyAnalyzerTest {
    @Test
    void testWords() {
        assertEquals(
                5,
                VowelFrequencyAnalyzer.countVowels("Education")
        );

        assertEquals(
                2,
                VowelFrequencyAnalyzer.countVowels("Java")
        );
    }

    @Test
    void testEmpty() {
        assertEquals(
                0,
                VowelFrequencyAnalyzer.countVowels("")
        );
    }

    @Test
    void testNull() {
        assertEquals(
                0,
                VowelFrequencyAnalyzer.countVowels(null)
        );
    }
}