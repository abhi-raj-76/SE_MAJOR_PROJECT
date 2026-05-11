import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountCompleteTreeNodesTest {
    @Test
    void testCount() {
        assertEquals(0, CountCompleteTreeNodes.countNodes(null));
    }
}