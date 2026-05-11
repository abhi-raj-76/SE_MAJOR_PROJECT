import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxElementFinderTest {
    @Test
    void testPositive() {
        assertEquals(9, MaxElementFinder.findMax(new int[]{1, 5, 9, 3}));
    }

    @Test
    void testNegative() {
        assertEquals(-1, MaxElementFinder.findMax(new int[]{-5, -1, -10}));
    }

    @Test
    void testAllSame() {
        assertEquals(7, MaxElementFinder.findMax(new int[]{7, 7, 7}));
    }

    @Test
    void testSingleElement() {
        assertEquals(42, MaxElementFinder.findMax(new int[]{42}));
    }

    @Test
    void testEmpty() {
        assertThrows(IllegalArgumentException.class, () -> MaxElementFinder.findMax(new int[0]));
    }

    @Test
    void testNull() {
        assertThrows(IllegalArgumentException.class, () -> MaxElementFinder.findMax(null));
    }
}