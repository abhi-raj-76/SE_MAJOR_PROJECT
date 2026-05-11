import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysIIITest {
    @Test
    void testMedian() {
        assertEquals(2.0, MedianOfTwoSortedArraysIII.findMedianSortedArrays(new int[]{1,3}, new int[]{2})); // fails
    }
}