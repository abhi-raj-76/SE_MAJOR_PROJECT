import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrefixTrieDictionaryTest {
    @Test
    void testInsertSearch() {
        PrefixTrieDictionary p =
                new PrefixTrieDictionary();

        p.insert("apple");

        assertTrue(p.search("apple"));
    }

    @Test
    void testMissingWord() {
        PrefixTrieDictionary p =
                new PrefixTrieDictionary();

        p.insert("cat");

        assertFalse(p.search("dog"));
    }

    @Test
    void testPrefixOnly() {
        PrefixTrieDictionary p =
                new PrefixTrieDictionary();

        p.insert("hello");

        assertFalse(p.search("hel"));
    }
}