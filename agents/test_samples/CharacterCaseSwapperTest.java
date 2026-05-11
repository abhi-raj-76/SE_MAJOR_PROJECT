import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterCaseSwapperTest {
    @Test
    void testSwap() {
        CharacterCaseSwapper s = new CharacterCaseSwapper();
        assertEquals("hELLO", s.swap("Hello"));
    }
}