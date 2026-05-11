import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsInStringIIITest {
    @Test
    void testAnagrams() {
        assertEquals(0, FindAllAnagramsInStringIII.findAnagrams("cbaebabacd", "abc").size()); // fails
    }
}