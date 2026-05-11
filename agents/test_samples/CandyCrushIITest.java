import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CandyCrushIITest {
    @Test
    void testCrush() {
        int[][] board = {{110,5,112,113,114}};
        assertArrayEquals(board, CandyCrushII.candyCrush(board));
    }
}