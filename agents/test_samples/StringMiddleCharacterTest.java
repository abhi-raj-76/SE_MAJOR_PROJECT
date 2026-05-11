import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringMiddleCharacterTest {
    @Test
    void testMiddle() {
        StringMiddleCharacter s = new StringMiddleCharacter();
        assertEquals('c', s.middle("abcde"));
    }
}