import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    void testSearchFound() {
        assertEquals(2, BinarySearch.search(new int[]{1, 3, 5, 7, 9}, 5));
    }

    @Test
    void testSearchNotFound() {
        assertEquals(-1, BinarySearch.search(new int[]{1, 3, 5, 7, 9}, 4));
    }

    @Test
    void testSearchFirstElement() {
        assertEquals(0, BinarySearch.search(new int[]{2, 4, 6, 8}, 2));
    }

    @Test
    void testSearchLastElement() {
        assertEquals(3, BinarySearch.search(new int[]{2, 4, 6, 8}, 8));
    }

    @Test
    void testSearchNullArray() {
        assertEquals(-1, BinarySearch.search(null, 5));
    }

    @Test
    void testSearchEmptyArray() {
        assertEquals(-1, BinarySearch.search(new int[]{}, 5));
    }

    @Test
    void testRecursiveSearch() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(3, BinarySearch.searchRecursive(arr, 7, 0, arr.length - 1));
    }

    @Test
    void testContainsTrue() {
        assertTrue(BinarySearch.contains(new int[]{10, 20, 30, 40}, 30));
    }

    @Test
    void testContainsFalse() {
        assertFalse(BinarySearch.contains(new int[]{10, 20, 30, 40}, 25));
    }

    @Test
    void testSearchSingleElement() {
        assertEquals(0, BinarySearch.search(new int[]{7}, 7));
    }
}