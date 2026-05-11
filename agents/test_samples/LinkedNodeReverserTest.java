import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedNodeReverserTest {
    @Test
    void testReverse() {
        LinkedNodeReverser l =
                new LinkedNodeReverser();

        LinkedNodeReverser.Node a =
                new LinkedNodeReverser.Node(1);

        LinkedNodeReverser.Node b =
                new LinkedNodeReverser.Node(2);

        a.next = b;

        LinkedNodeReverser.Node result =
                l.reverse(a);

        assertEquals(2, result.val);
    }

    @Test
    void testSingle() {
        LinkedNodeReverser l =
                new LinkedNodeReverser();

        LinkedNodeReverser.Node a =
                new LinkedNodeReverser.Node(5);

        LinkedNodeReverser.Node result =
                l.reverse(a);

        assertEquals(5, result.val);
    }

    @Test
    void testNull() {
        LinkedNodeReverser l =
                new LinkedNodeReverser();

        assertNull(l.reverse(null));
    }
}