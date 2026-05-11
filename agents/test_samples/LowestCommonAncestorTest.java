import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorTest {
    @Test
    void testLCA() {
        assertNotNull(LowestCommonAncestor.lowestCommonAncestor(null, null, null));
    }
}