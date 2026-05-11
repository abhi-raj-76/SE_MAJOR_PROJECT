import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramVTest {
    @Test
    void testAnagram() {
        assertTrue(ValidAnagramV.isAnagram("anagram", "nagaram")); // fails
    }
}