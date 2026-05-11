import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    @Test
    void testAnagram() {
        assertTrue(ValidAnagram.isAnagram("anagram", "nagaram"));
    }
}