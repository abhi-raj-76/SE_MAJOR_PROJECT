import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KnightProbabilityTest {
    @Test
    void testProbability() {
        assertEquals(0.0, KnightProbability.knightProbability(1, 0, 0, 0));
    }
}