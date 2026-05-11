import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignSnakeGameIIITest {
    @Test
    void testMove() {
        DesignSnakeGameIII game = new DesignSnakeGameIII();
        assertEquals(0, game.move("U"));
    }
}