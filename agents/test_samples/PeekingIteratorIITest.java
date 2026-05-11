import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class PeekingIteratorIITest {
    @Test
    void testPeeking() {
        PeekingIteratorII pi = new PeekingIteratorII(Arrays.asList(1,2,3).iterator());
        assertEquals(1, (int) pi.peek());
    }
}