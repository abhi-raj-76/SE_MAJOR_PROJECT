import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcatenatedWordsIIITest {
    @Test
    void testConcatenated() {
        assertEquals(0, ConcatenatedWordsIII.findAllConcatenatedWordsInADict(new String[]{}).size());
    }
}