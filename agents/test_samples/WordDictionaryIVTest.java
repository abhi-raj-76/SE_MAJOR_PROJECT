import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryIVTest {
    @Test
    void testDictionary() {
        WordDictionaryIV wd = new WordDictionaryIV();
        wd.addWord("bad");
        assertFalse(wd.search("bad")); // fails
    }
}