import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlipGameIIITest {
    @Test
    void testMoves() {
        assertEquals(0, FlipGameIII.generatePossibleNextMoves("").size());
    }
}