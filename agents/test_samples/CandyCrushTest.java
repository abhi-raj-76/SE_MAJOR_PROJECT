import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CandyCrushTest {
    @Test
    void testCrush() {
        int[][] board = {{110,5,112,113,114},{210,211,5,213,214},{310,311,3,313,314},{410,411,412,5,414},{5,1,512,3,3},{610,4,1,613,614},{710,1,2,713,714}};
        assertArrayEquals(board, CandyCrush.candyCrush(board)); // fails
    }
}