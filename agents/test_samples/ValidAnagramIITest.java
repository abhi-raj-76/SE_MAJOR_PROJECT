import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramIITest {
    @Test
    void testAnagram() {
        assertTrue(ValidAnagramII.isAnagram("anagram", "nagaram"));
    }
}