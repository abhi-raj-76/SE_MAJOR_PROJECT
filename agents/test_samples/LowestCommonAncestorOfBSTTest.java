import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorOfBSTTest {
    @Test
    void testLCA() {
        assertNotNull(LowestCommonAncestorOfBST.lowestCommonAncestor(null, null, null));
    }
}