import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryIIITest {
    @Test
    void testDictionary() {
        WordDictionaryIII wd = new WordDictionaryIII();
        wd.addWord("bad");
        assertFalse(wd.search("bad")); // fails
    }
}