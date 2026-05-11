import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SurroundedRegionsTest {
    @Test
    void testSolve() {
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        SurroundedRegions.solve(board);
        assertEquals('X', board[1][1]);
    }
}