import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IslandCounterGridTest {
    @Test
    void testIslandCount() {
        IslandCounterGrid i = new IslandCounterGrid();

        char[][] grid = {
                {'1','1','0'},
                {'0','1','0'},
                {'1','0','1'}
        };

        assertEquals(3, i.count(grid));
    }
}