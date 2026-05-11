import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingNumberFinderTest {
    @Test
    void testMissingThree() {
        assertEquals(3, MissingNumberFinder.findMissing(new int[]{1, 2, 4, 5}, 5));
    }

    @Test
    void testMissingOne() {
        assertEquals(1, MissingNumberFinder.findMissing(new int[]{2, 3, 4}, 4));
    }

    @Test
    void testMissingLast() {
        assertEquals(5, MissingNumberFinder.findMissing(new int[]{1, 2, 3, 4}, 5));
    }

    @Test
    void testSingle() {
        assertEquals(1, MissingNumberFinder.findMissing(new int[0], 1));
    }

    @Test
    void testTwo() {
        assertEquals(2, MissingNumberFinder.findMissing(new int[]{1}, 2));
    }

    @Test
    void testLargeN() {
        int[] arr = {1,2,3,4,5,6,7,8,10};
        assertEquals(9, MissingNumberFinder.findMissing(arr, 10));
    }
}