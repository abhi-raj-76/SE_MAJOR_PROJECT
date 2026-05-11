import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MiddleCharacterFinderTest {
    @Test
    void testMiddle() {
        MiddleCharacterFinder m = new MiddleCharacterFinder();
        assertEquals('c', m.middle("abcde"));
    }
}