import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListOperationsTest {

    private LinkedListOperations.Node buildList(int... values) {
        LinkedListOperations.Node head = null;
        for (int v : values) head = LinkedListOperations.insert(head, v);
        return head;
    }

    @Test
    void testInsertAndLength() {
        LinkedListOperations.Node head = buildList(1, 2, 3);
        assertEquals(3, LinkedListOperations.length(head));
    }

    @Test
    void testLengthEmptyList() {
        assertEquals(0, LinkedListOperations.length(null));
    }

    @Test
    void testReverse() {
        LinkedListOperations.Node head = buildList(1, 2, 3);
        LinkedListOperations.Node reversed = LinkedListOperations.reverse(head);
        assertEquals(3, reversed.data);
        assertEquals(2, reversed.next.data);
        assertEquals(1, reversed.next.next.data);
    }

    @Test
    void testReverseNull() {
        assertNull(LinkedListOperations.reverse(null));
    }

    @Test
    void testNoCycle() {
        LinkedListOperations.Node head = buildList(1, 2, 3);
        assertFalse(LinkedListOperations.hasCycle(head));
    }

    @Test
    void testHasCycle() {
        LinkedListOperations.Node n1 = new LinkedListOperations.Node(1);
        LinkedListOperations.Node n2 = new LinkedListOperations.Node(2);
        LinkedListOperations.Node n3 = new LinkedListOperations.Node(3);
        n1.next = n2; n2.next = n3; n3.next = n1;
        assertTrue(LinkedListOperations.hasCycle(n1));
    }

    @Test
    void testFindMiddleOdd() {
        LinkedListOperations.Node head = buildList(1, 2, 3, 4, 5);
        assertEquals(3, LinkedListOperations.findMiddle(head).data);
    }

    @Test
    void testFindMiddleEven() {
        LinkedListOperations.Node head = buildList(1, 2, 3, 4);
        assertEquals(2, LinkedListOperations.findMiddle(head).data);
    }

    @Test
    void testFindMiddleNull() {
        assertNull(LinkedListOperations.findMiddle(null));
    }

    @Test
    void testInsertSingleNode() {
        LinkedListOperations.Node head = LinkedListOperations.insert(null, 10);
        assertEquals(10, head.data);
        assertNull(head.next);
    }
}