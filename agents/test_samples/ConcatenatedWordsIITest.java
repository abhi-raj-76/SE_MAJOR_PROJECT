import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcatenatedWordsIITest {
    @Test
    void testConcatenated() {
        assertEquals(0, ConcatenatedWordsII.findAllConcatenatedWordsInADict(new String[]{}).size());
    }
}