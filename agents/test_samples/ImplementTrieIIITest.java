import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImplementTrieIIITest {
    @Test
    void testTrie() {
        ImplementTrieIII trie = new ImplementTrieIII();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
    }
}