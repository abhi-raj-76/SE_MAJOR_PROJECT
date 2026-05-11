import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PerfectSquaresTest {
    @Test
    void testSquares() {
        assertEquals(3, PerfectSquares.numSquares(12));
    }
}