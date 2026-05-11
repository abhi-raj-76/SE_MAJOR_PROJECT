import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeapPriorityManagerTest {
    @Test
    void testPriorityHeap() {
        HeapPriorityManager h =
                new HeapPriorityManager();

        h.add(5);
        h.add(2);
        h.add(8);

        assertEquals(2, h.peek());
    }
}