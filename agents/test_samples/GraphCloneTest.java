import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraphCloneTest {
    @Test
    void testClone() {
        assertNull(GraphClone.cloneGraph(null));
    }
}