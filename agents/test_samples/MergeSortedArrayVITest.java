import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayVITest {
    @Test
    void testMerge() {
        MergeSortedArrayVI solver = new MergeSortedArrayVI();
        int[] nums1 = {1,2,3,0,0,0};
        solver.merge(nums1, 3, new int[]{2,5,6}, 3);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }
}