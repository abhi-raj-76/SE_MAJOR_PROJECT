import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsVITest {
    @Test
    void testMerge() {
        MergeKSortedListsVI solver = new MergeKSortedListsVI();
        assertNotNull(solver.mergeKLists(new MergeKSortedListsVI.ListNode[0]));
    }
}