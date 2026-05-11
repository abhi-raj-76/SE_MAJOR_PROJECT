import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NaryTreeMaxDepthTest {
    @Test
    void testMaxDepth() {
        assertEquals(999, NaryTreeMaxDepth.maxDepth(null));
    }
}