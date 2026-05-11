import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroesVITest {
    @Test
    void testZeroes() {
        SetMatrixZeroesVI solver = new SetMatrixZeroesVI();
        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
        solver.setZeroes(mat);
        assertEquals(0, mat[1][1]);
    }
}