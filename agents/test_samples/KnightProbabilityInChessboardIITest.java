import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KnightProbabilityInChessboardIITest {
    @Test
    void testProbability() {
        assertEquals(0.0, KnightProbabilityInChessboardII.knightProbability(1, 0, 0, 0));
    }
}