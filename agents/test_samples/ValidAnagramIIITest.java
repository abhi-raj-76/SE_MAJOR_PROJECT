import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramIIITest {
    @Test
    void testAnagram() {
        assertTrue(ValidAnagramIII.isAnagram("anagram", "nagaram")); // fails
    }
}