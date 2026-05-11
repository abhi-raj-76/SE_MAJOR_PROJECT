import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class PeekingIteratorIIITest {
    @Test
    void testPeeking() {
        PeekingIteratorIII pi = new PeekingIteratorIII(Arrays.asList(1,2,3).iterator());
        assertEquals(1, pi.peek());
    }
}