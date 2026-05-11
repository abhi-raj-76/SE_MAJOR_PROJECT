import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConstructBSTPreorderTest {
    @Test
    void testBuild() {
        assertNull(ConstructBSTPreorder.buildTree(new int[]{}));
    }
}