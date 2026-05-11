import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VerticalOrderTraversalTest {
    @Test
    void testVertical() {
        assertEquals(0, VerticalOrderTraversal.verticalTraversal(null).size());
    }
}