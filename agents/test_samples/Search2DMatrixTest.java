import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Search2DMatrixTest {
    @Test
    void testFound() {
        int[][] m = {{1,3,5},{10,11,16},{23,30,34}};
        assertTrue(Search2DMatrix.searchMatrix(m, 3));
    }
}