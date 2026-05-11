import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoLinkedListsTest {
    @Test
    void testMergeLists() {
        MergeTwoLinkedLists m = new MergeTwoLinkedLists();

        MergeTwoLinkedLists.Node a =
                new MergeTwoLinkedLists.Node(1);

        a.next = new MergeTwoLinkedLists.Node(3);

        MergeTwoLinkedLists.Node b =
                new MergeTwoLinkedLists.Node(2);

        b.next = new MergeTwoLinkedLists.Node(4);

        assertEquals(1, m.merge(a,b).val);
    }
}