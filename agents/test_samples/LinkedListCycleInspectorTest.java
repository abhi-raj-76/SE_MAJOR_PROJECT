import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleInspectorTest {

    @Test
    void testCycle() {
        LinkedListCycleInspector l =
                new LinkedListCycleInspector();

        LinkedListCycleInspector.Node a =
                new LinkedListCycleInspector.Node(1);

        LinkedListCycleInspector.Node b =
                new LinkedListCycleInspector.Node(2);

        a.next = b;
        b.next = a;

        assertTrue(l.hasCycle(a));
    }

    @Test
    void testNoCycle() {
        LinkedListCycleInspector l =
                new LinkedListCycleInspector();

        LinkedListCycleInspector.Node a =
                new LinkedListCycleInspector.Node(1);

        assertFalse(l.hasCycle(a));
    }
}