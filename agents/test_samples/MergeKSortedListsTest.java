import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {
    @Test
    void testMergeK() {
        assertNull(MergeKSortedLists.mergeKLists(new ListNode[0]));
    }
}