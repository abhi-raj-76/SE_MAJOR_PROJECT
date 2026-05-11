import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallestNumberFinderTest {
    @Test
    void testSmallest() {
        SmallestNumberFinder s = new SmallestNumberFinder();
        assertEquals(1, s.smallest(new int[]{5,1,9}));
    }
}