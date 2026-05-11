import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniquePathsGridTest {
    @Test
    void testPaths() {
        assertEquals(28, UniquePathsGrid.uniquePaths(7, 3));
    }
}