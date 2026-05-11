import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {
    @Test
    void testLower() {
        assertEquals(0, FirstUniqueCharacter.firstUniqChar("leetcode"));
    }
    @Test
    void testAllRepeat() {
        assertEquals(-1, FirstUniqueCharacter.firstUniqChar("aabb"));
    }
    @Test
    void testUpper() {  // Will fail due to bug
        assertEquals(0, FirstUniqueCharacter.firstUniqChar("Abc"));
    }
    @Test
    void testEmpty() {
        assertEquals(-1, FirstUniqueCharacter.firstUniqChar(""));
    }
    @Test
    void testNull() {
        assertEquals(-1, FirstUniqueCharacter.firstUniqChar(null));
    }
}