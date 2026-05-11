import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsInStringIITest {
    @Test
    void testAnagrams() {
        assertEquals(0, FindAllAnagramsInStringII.findAnagrams("cbaebabacd", "abc").size()); // fails
    }
}