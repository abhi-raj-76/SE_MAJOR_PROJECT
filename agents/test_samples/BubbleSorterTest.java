import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSorterTest {
    @Test
    void testUnsorted() {
        int[] arr = {5, 3, 8, 4, 2};
        BubbleSorter.sort(arr);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr);
    }

    @Test
    void testSorted() {
        int[] arr = {1, 2, 3};
        BubbleSorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    void testEmpty() {
        int[] arr = {};
        BubbleSorter.sort(arr);
        assertArrayEquals(new int[0], arr);
    }

    @Test
    void testDuplicates() {
        int[] arr = {4, 4, 2, 2};
        BubbleSorter.sort(arr);
        assertArrayEquals(new int[]{2, 2, 4, 4}, arr);
    }

    @Test
    void testSingle() {
        int[] arr = {10};
        BubbleSorter.sort(arr);
        assertArrayEquals(new int[]{10}, arr);
    }

    @Test
    void testNull() {
        BubbleSorter.sort(null); // no exception
    }
}