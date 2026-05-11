import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountOccurrencesTest {
    @Test
    void testMultiple() {
        assertEquals(3, CountOccurrences.count(new int[]{1,2,1,3,1}, 1)); // fails
    }

    @Test
    void testNone() {
        assertEquals(0, CountOccurrences.count(new int[]{1,2,3}, 5));
    }

    @Test
    void testAll() {
        assertEquals(4, CountOccurrences.count(new int[]{7,7,7,7}, 7));
    }

    @Test
    void testEmpty() {
        assertEquals(0, CountOccurrences.count(new int[0], 1));
    }

    @Test
    void testNull() {
        assertEquals(0, CountOccurrences.count(null, 10));
    }

    @Test
    void testSingleMatch() {
        assertEquals(1, CountOccurrences.count(new int[]{5}, 5));
    }
}