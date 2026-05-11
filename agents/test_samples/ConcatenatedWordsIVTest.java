import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcatenatedWordsIVTest {
    @Test
    void testConcatenated() {
        assertEquals(0, ConcatenatedWordsIV.findAllConcatenatedWordsInADict(new String[]{}).size());
    }
}