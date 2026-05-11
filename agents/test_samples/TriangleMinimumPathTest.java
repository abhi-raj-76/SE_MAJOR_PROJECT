import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleMinimumPathTest {
    @Test
    void testMinimumTotal() {
        java.util.List<java.util.List<Integer>> t = java.util.List.of(java.util.List.of(2), java.util.List.of(3,4));
        assertTrue(TriangleMinimumPath.minimumTotal(t) > 0);
    }
}