import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DungeonGameTest {
    @Test
    void testHP() {
        int[][] dungeon = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        assertEquals(7, DungeonGame.calculateMinimumHP(dungeon));
    }
}