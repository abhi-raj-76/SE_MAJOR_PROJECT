import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreeFromPreorderInorderTest {
    @Test
    void testBuild() {
        assertNull(ConstructBinaryTreeFromPreorderInorder.buildTree(new int[]{}, new int[]{}));
    }
}