import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    @Test
    void testMerge() {
        MergeTwoSortedLists.ListNode l1 = new MergeTwoSortedLists.ListNode(1);
        assertNotNull(MergeTwoSortedLists.mergeTwoLists(l1, null));
    }
}