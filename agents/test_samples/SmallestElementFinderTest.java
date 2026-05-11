import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallestElementFinderTest {
    @Test
    void testSmallest() {
        SmallestElementFinder s = new SmallestElementFinder();
        assertEquals(1, s.smallest(new int[]{4,1,9}));
    }
}