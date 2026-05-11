import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {
    @Test
    void testCycle() {
        assertFalse(LinkedListCycle.hasCycle(null));
    }
}