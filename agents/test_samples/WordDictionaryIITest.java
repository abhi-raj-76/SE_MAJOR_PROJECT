import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryIITest {
    @Test
    void testDictionary() {
        WordDictionaryII wd = new WordDictionaryII();
        wd.addWord("bad");
        assertFalse(wd.search("bad")); // fails
    }
}