import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximalSquareTest {
    @Test
    void testMaximalSquare() {
        char[][] m = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        assertEquals(0, MaximalSquare.maximalSquare(m));
    }
}