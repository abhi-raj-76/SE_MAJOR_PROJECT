import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharacterFinderTest {
    @Test
    void testDuplicate() {
        DuplicateCharacterFinder d = new DuplicateCharacterFinder();
        assertTrue(d.hasDuplicate("hello"));
    }
}