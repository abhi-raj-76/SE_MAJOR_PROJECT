import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StoneGameTest {
    @Test
    void testStoneGame() {
        assertTrue(StoneGame.stoneGame(new int[]{5,3,4,5}));
    }
}