import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsInStringTest {
    @Test
    void testAnagrams() {
        assertEquals(java.util.List.of(0,6), FindAllAnagramsInString.findAnagrams("cbaebabacd", "abc"));
    }
}