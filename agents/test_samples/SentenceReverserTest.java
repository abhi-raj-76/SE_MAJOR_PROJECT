import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SentenceReverserTest {
    @Test
    void testReverseSentence() {
        SentenceReverser s = new SentenceReverser();
        assertEquals("world hello", s.reverse("hello world"));
    }
}