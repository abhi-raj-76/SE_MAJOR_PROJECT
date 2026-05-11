import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IslandCounterDFSTest {
    @Test
    void testIslandCount() {
        IslandCounterDFS i =
                new IslandCounterDFS();

        char[][] grid = {
                {'1','1','0'},
                {'0','1','0'},
                {'1','0','1'}
        };

        assertEquals(3,
                i.countIslands(grid));
    }

    @Test
    void testEmptyGrid() {
        IslandCounterDFS i =
                new IslandCounterDFS();

        assertEquals(0,
                i.countIslands(new char[0][0]));
    }

    @Test
    void testNoIsland() {
        IslandCounterDFS i =
                new IslandCounterDFS();

        char[][] grid = {
                {'0','0'},
                {'0','0'}
        };

        assertEquals(0,
                i.countIslands(grid));
    }
}