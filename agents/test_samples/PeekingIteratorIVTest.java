import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class PeekingIteratorIVTest {
    @Test
    void testPeeking() {
        PeekingIteratorIV pi = new PeekingIteratorIV(Arrays.asList(1,2,3).iterator());
        assertEquals(1, pi.peek());
    }
}