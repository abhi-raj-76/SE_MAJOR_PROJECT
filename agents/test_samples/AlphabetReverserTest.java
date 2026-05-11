import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlphabetReverserTest {
    @Test
    void testReverse() {
        AlphabetReverser a = new AlphabetReverser();
        assertEquals("dcba", a.reverse("abcd"));
    }
}