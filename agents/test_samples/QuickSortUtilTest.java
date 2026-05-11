import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuickSortUtilTest {
    @Test
    void testUnsorted() {
        int[] arr = {3,1,4,1,5};
        QuickSortUtil.sort(arr);
        assertArrayEquals(new int[]{1,1,3,4,5}, arr);  // Fails due to index bug
    }

    @Test
    void testSorted() {
        int[] arr = {1,2,3};
        QuickSortUtil.sort(arr);
        assertArrayEquals(new int[]{1,2,3}, arr);
    }

    @Test
    void testEmpty() {
        int[] arr = {};
        QuickSortUtil.sort(arr);
    }

    @Test
    void testSingle() {
        int[] arr = {42};
        QuickSortUtil.sort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void testDuplicates() {
        int[] arr = {5,5,5};
        QuickSortUtil.sort(arr);
        assertArrayEquals(new int[]{5,5,5}, arr);
    }
}