import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayIITest {
    @Test
    void testMerge() {
        int[] nums1 = {1,2,3,0,0,0};
        MergeSortedArrayII.merge(nums1, 3, new int[]{2,5,6}, 3);
    }
}