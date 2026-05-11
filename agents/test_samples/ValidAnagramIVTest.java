import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramIVTest {
    @Test
    void testAnagram() {
        assertTrue(ValidAnagramIV.isAnagram("anagram", "nagaram")); // fails
    }
}