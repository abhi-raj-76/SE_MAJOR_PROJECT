import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DungeonGameIIITest {
    @Test
    void testHP() {
        assertEquals(1, DungeonGameIII.calculateMinimumHP(new int[][]{{0}}));
    }
}