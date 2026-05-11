import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountSquareSubmatricesTest {
    @Test
    void testCount() {
        int[][] matrix = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        assertEquals(15, CountSquareSubmatrices.countSquares(matrix));
    }
}