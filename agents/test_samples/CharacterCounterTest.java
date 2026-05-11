import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterCounterTest {
    @Test
    void testCharacterCount() {
        CharacterCounter c = new CharacterCounter();
        assertEquals(2, c.count("banana",'n'));
    }
}