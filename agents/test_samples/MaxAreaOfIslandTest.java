import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxAreaOfIslandTest {
    @Test
    void testMaxArea() {
        assertEquals(0, MaxAreaOfIsland.maxAreaOfIsland(new int[][]{{0}}));
    }
}