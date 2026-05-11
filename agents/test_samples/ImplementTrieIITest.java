import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImplementTrieIITest {
    @Test
    void testTrie() {
        ImplementTrieII trie = new ImplementTrieII();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
    }
}