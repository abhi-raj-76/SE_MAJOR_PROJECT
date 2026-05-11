import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysIVTest {
    @Test
    void testMedian() {
        assertEquals(2.0, MedianOfTwoSortedArraysIV.findMedianSortedArrays(new int[]{1,3}, new int[]{2})); // fails
    }
}