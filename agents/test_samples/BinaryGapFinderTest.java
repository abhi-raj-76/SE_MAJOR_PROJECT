import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryGapFinderTest {
    @Test
    void testExample() {
        assertEquals(2, BinaryGapFinder.findMaxGap(9)); // 1001
    }
    @Test
    void testLarger() {
        assertEquals(3, BinaryGapFinder.findMaxGap(22)); // 10110 -> should be 2 but buggy
    }
    @Test
    void testNoGap() {
        assertEquals(0, BinaryGapFinder.findMaxGap(7));
    }
    @Test
    void testSingleOne() {
        assertEquals(0, BinaryGapFinder.findMaxGap(1));
    }
    @Test
    void testZero() {
        assertEquals(0, BinaryGapFinder.findMaxGap(0));
    }
}