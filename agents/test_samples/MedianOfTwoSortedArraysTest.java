import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {
    @Test
    void testMedian() {
        assertEquals(2.0, MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }
}