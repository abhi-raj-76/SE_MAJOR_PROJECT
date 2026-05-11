import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniqueCharacterCounterTest {
    @Test
    void testCount() {
        UniqueCharacterCounter u = new UniqueCharacterCounter();
        assertEquals(4, u.count("abcae"));
    }
}