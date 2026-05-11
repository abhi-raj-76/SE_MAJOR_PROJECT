import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeRightSideViewTest {
    @Test
    void testRightSide() {
        assertEquals(0, BinaryTreeRightSideView.rightSideView(null).size());
    }
}