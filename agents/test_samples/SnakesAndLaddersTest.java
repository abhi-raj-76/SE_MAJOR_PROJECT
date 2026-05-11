import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SnakesAndLaddersTest {
    @Test
    void testGame() {
        assertEquals(-1, SnakesAndLadders.snakesAndLadders(new int[][]{{-1}}));
    }
}