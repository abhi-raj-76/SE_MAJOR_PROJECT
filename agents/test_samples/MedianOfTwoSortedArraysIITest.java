import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysIITest {
    @Test
    void testMedian() {
        assertEquals(2.0, MedianOfTwoSortedArraysII.findMedianSortedArrays(new int[]{1,3}, new int[]{2})); // fails
    }
}