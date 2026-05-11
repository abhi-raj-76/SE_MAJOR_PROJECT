import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromePairsIITest {
    @Test
    void testPairs() {
        assertEquals(0, PalindromePairsII.palindromePairs(new String[]{}).size());
    }
}