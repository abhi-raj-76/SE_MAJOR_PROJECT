import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JosephusProblemSolverTest {
    @Test
    void testFiveThree() {
        assertEquals(4, JosephusProblemSolver.findLastRemaining(5, 3));
    }

    @Test
    void testOne() {
        assertEquals(1, JosephusProblemSolver.findLastRemaining(1, 5));
    }

    @Test
    void testTenTwo() {
        assertEquals(1, JosephusProblemSolver.findLastRemaining(10, 2));
    }

    @Test
    void testSevenThree() {
        assertEquals(4, JosephusProblemSolver.findLastRemaining(7, 3));
    }
}