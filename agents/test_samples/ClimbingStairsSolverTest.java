import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsSolverTest {
    @Test
    void testClimbStairs() {
        ClimbingStairsSolver c = new ClimbingStairsSolver();
        assertEquals(8, c.climb(5));
    }
}