import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZigzagLevelOrderTest {
    @Test
    void testZigzag() {
        assertEquals(0, ZigzagLevelOrder.zigzagLevelOrder(null).size());
    }
}