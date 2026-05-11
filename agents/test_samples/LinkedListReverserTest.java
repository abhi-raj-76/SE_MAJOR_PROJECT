import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListReverserTest {
    @Test
    void testReverse() {
        LinkedListReverser list =
                new LinkedListReverser();

        LinkedListReverser.Node a =
                new LinkedListReverser.Node(1);

        LinkedListReverser.Node b =
                new LinkedListReverser.Node(2);

        LinkedListReverser.Node c =
                new LinkedListReverser.Node(3);

        a.next = b;
        b.next = c;

        LinkedListReverser.Node head =
                list.reverse(a);

        assertEquals(3, head.value);
        assertEquals(2, head.next.value);
        assertEquals(1, head.next.next.value);
    }

    @Test
    void testSingle() {
        LinkedListReverser list =
                new LinkedListReverser();

        LinkedListReverser.Node a =
                new LinkedListReverser.Node(9);

        LinkedListReverser.Node head =
                list.reverse(a);

        assertEquals(9, head.value);
    }

    @Test
    void testNull() {
        LinkedListReverser list =
                new LinkedListReverser();

        assertNull(list.reverse(null));
    }
}