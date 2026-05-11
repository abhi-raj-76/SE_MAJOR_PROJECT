import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecondLargestFinderTest {
    @Test
    void testNormal() {
        assertEquals(4, SecondLargestFinder.findSecondLargest(new int[]{5, 3, 4, 1, 2})); // fails
    }

    @Test
    void testDuplicates() {
        assertEquals(5, SecondLargestFinder.findSecondLargest(new int[]{7, 7, 5}));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-5, SecondLargestFinder.findSecondLargest(new int[]{-1, -5, -10}));
    }

    @Test
    void testTwoElements() {
        assertEquals(1, SecondLargestFinder.findSecondLargest(new int[]{2, 1}));
    }

    @Test
    void testAllSame() {
        assertThrows(IllegalArgumentException.class, () -> SecondLargestFinder.findSecondLargest(new int[]{10,10,10}));
    }

    @Test
    void testNull() {
        assertThrows(IllegalArgumentException.class, () -> SecondLargestFinder.findSecondLargest(null));
    }
}