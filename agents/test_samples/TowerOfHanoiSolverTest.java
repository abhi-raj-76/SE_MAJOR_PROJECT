import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiSolverTest {
    @Test
    void testOne() {
        assertEquals(1, TowerOfHanoiSolver.moves(1));
    }

    @Test
    void testTwo() {
        assertEquals(3, TowerOfHanoiSolver.moves(2));
    }

    @Test
    void testThree() {
        assertEquals(7, TowerOfHanoiSolver.moves(3));  // Passes
    }

    @Test
    void testZero() {
        assertEquals(0, TowerOfHanoiSolver.moves(0));  // Fails, returns 1 from recursion path
    }

    @Test
    void testFour() {
        assertEquals(15, TowerOfHanoiSolver.moves(4));
    }
}