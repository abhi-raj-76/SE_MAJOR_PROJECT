import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterSwapperTest {
    @Test
    void testSwap() {
        CharacterSwapper c = new CharacterSwapper();
        assertEquals("ba", c.swap("ab"));
    }
}