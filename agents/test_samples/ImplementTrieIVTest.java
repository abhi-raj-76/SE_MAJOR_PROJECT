import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImplementTrieIVTest {
    @Test
    void testTrie() {
        ImplementTrieIV trie = new ImplementTrieIV();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
    }
}