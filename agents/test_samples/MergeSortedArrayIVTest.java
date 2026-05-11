import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayIVTest {
    @Test
    void testMerge() {
        int[] nums1 = {1,2,3,0,0,0};
        MergeSortedArrayIV.merge(nums1, 3, new int[]{2,5,6}, 3);
    }
}