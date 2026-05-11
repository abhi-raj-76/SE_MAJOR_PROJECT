import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramGroupCounterTest {
    @Test
    void testExample() {
        assertEquals(2, AnagramGroupCounter.countGroups(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    @Test
    void testEmpty() {
        assertEquals(0, AnagramGroupCounter.countGroups(new String[]{}));
    }
    @Test
    void testNoAnagrams() {
        assertEquals(0, AnagramGroupCounter.countGroups(new String[]{"abc","def"}));
    }
    @Test
    void testAllSame() {
        assertEquals(1, AnagramGroupCounter.countGroups(new String[]{"aa","aa","aa"}));
    }
    @Test
    void testNull() {
        assertEquals(0, AnagramGroupCounter.countGroups(null));
    }
}