import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroesTest {
    @Test
    void testZeroes() {
        int[][] m = {{1,1,1},{1,0,1},{1,1,1}};
        SetMatrixZeroes.setZeroes(m);
        assertEquals(0, m[1][1]);
    }
}