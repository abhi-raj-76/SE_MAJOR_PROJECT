import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    @Test
    void testMerge() {
        int[] nums1 = {1,2,3,0,0,0};
        MergeSortedArray.merge(nums1, 3, new int[]{2,5,6}, 3);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1); // fails
    }
}