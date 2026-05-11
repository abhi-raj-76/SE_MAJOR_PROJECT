import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterPositionFinderTest {
    @Test
    void testPosition() {
        CharacterPositionFinder c = new CharacterPositionFinder();
        assertEquals(1, c.position("java",'a'));
    }
}