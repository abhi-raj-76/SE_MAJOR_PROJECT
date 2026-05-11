import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlipGameTest {
    @Test
    void testMoves() {
        assertEquals(0, FlipGame.generatePossibleNextMoves("++++").size());
    }
}