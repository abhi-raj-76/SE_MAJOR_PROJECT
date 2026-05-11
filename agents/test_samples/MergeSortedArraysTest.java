import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArraysTest {
    @Test
    void testNormal() {
        assertArrayEquals(new int[]{1,2,3,4,5}, MergeSortedArrays.merge(new int[]{1,3}, new int[]{2,4,5}));
    }

    @Test
    void testOneEmpty() {
        assertArrayEquals(new int[]{1,2}, MergeSortedArrays.merge(new int[]{1,2}, new int[]{}));
    }

    @Test
    void testDuplicates() {
        assertArrayEquals(new int[]{1,1,2}, MergeSortedArrays.merge(new int[]{1}, new int[]{1,2}));  // Fails
    }

    @Test
    void testBothEmpty() {
        assertArrayEquals(new int[]{}, MergeSortedArrays.merge(new int[]{}, new int[]{}));
    }

    @Test
    void testNegative() {
        assertArrayEquals(new int[]{-5,-1,0}, MergeSortedArrays.merge(new int[]{-5,0}, new int[]{-1}));
    }
}