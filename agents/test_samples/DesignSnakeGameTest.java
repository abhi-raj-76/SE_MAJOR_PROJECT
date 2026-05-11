import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignSnakeGameTest {
    @Test
    void testMove() {
        DesignSnakeGame game = new DesignSnakeGame();
        assertEquals(0, game.move("U"));
    }
}