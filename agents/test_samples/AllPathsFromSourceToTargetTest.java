import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AllPathsFromSourceToTargetTest {
    @Test
    void testPaths() {
        assertEquals(2, AllPathsFromSourceToTarget.allPathsSourceTarget(new int[][]{{1,2},{3},{3},{}}).size()); // fails
    }
}