import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {
    @Test
    void testWordDictionary() {
        WordDictionary wd = new WordDictionary();
        wd.addWord("bad");
        assertTrue(wd.search("bad"));
    }
}