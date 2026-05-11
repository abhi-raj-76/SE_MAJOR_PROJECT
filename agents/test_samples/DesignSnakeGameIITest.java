import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignSnakeGameIITest {
    @Test
    void testMove() {
        DesignSnakeGameII game = new DesignSnakeGameII();
        assertEquals(0, game.move("U"));
    }
}