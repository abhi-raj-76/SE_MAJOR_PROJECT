import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeLinkedNodesTest {
    @Test
    void testMerge() {
        MergeLinkedNodes.Node a =
                new MergeLinkedNodes.Node(1);

        a.next =
                new MergeLinkedNodes.Node(3);

        MergeLinkedNodes.Node b =
                new MergeLinkedNodes.Node(2);

        MergeLinkedNodes m =
                new MergeLinkedNodes();

        assertEquals(1,
                m.merge(a,b).val);
    }

    @Test
    void testSingleList() {
        MergeLinkedNodes.Node a =
                new MergeLinkedNodes.Node(5);

        MergeLinkedNodes m =
                new MergeLinkedNodes();

        assertEquals(5,
                m.merge(a,null).val);
    }

    @Test
    void testBothNull() {
        MergeLinkedNodes m =
                new MergeLinkedNodes();

        assertNull(m.merge(null,null));
    }
}