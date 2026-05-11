import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListMiddleFinderTest {
    @Test
    void testMiddleNode() {
        LinkedListMiddleFinder l = new LinkedListMiddleFinder();
        LinkedListMiddleFinder.Node a = new LinkedListMiddleFinder.Node(1);
        a.next = new LinkedListMiddleFinder.Node(2);
        a.next.next = new LinkedListMiddleFinder.Node(3);

        assertEquals(2, l.middle(a).val);
    }
}