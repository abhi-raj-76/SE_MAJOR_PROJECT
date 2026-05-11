import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsInStringIVTest {
    @Test
    void testAnagrams() {
        assertEquals(0, FindAllAnagramsInStringIV.findAnagrams("cbaebabacd", "abc").size()); // fails
    }
}