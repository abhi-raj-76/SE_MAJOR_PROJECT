import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestOddFinderTest {
    @Test
    void testLargestOdd() {
        LargestOddFinder l = new LargestOddFinder();
        assertEquals(9, l.find(new int[]{2,9,4,7}));
    }
}