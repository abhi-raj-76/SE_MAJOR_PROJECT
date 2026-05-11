import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeRightSideViewIITest {
    @Test
    void testRightSide() {
        assertEquals(0, BinaryTreeRightSideViewII.rightSideView(null).size());
    }
}