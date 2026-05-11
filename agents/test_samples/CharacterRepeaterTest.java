import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterRepeaterTest {
    @Test
    void testRepeat() {
        CharacterRepeater c = new CharacterRepeater();
        assertEquals("aaa", c.repeat('a',3));
    }
}