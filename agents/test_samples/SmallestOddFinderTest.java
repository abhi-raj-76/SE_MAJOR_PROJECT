import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallestOddFinderTest {
    @Test
    void testFind() {
        SmallestOddFinder s = new SmallestOddFinder();
        assertEquals(3, s.find(new int[]{8,3,7,5}));
    }
}