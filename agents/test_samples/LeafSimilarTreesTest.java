import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeafSimilarTreesTest {
    @Test
    void testLeafSimilar() {
        assertTrue(LeafSimilarTrees.leafSimilar(null, null));
    }
}