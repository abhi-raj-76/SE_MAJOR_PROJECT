import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcatenatedWordsTest {
    @Test
    void testConcatenated() {
        assertEquals(0, ConcatenatedWords.findAllConcatenatedWordsInADict(new String[]{}).size());
    }
}