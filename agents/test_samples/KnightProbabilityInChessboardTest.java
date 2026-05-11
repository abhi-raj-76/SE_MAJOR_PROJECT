import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KnightProbabilityInChessboardTest {
    @Test
    void testProbability() {
        assertEquals(0.0, KnightProbabilityInChessboard.knightProbability(1, 0, 0, 0));
    }
}