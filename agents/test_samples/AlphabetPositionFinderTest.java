import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlphabetPositionFinderTest {
    @Test
    void testPosition() {
        AlphabetPositionFinder a = new AlphabetPositionFinder();
        assertEquals(1, a.find('a'));
    }
}