import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DungeonGameIITest {
    @Test
    void testHP() {
        assertEquals(1, DungeonGameII.calculateMinimumHP(new int[][]{{0}}));
    }
}