import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LastCharacterFinderTest {
    @Test
    void testLastCharacter() {
        LastCharacterFinder l = new LastCharacterFinder();
        assertEquals('o', l.last("hello"));
    }
}