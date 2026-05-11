import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class PeekingIteratorTest {
    @Test
    void testPeeking() {
        PeekingIterator pi = new PeekingIterator(Arrays.asList(1,2,3).iterator());
        assertEquals(1, pi.peek());
    }
}