import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroesIVTest {
    @Test
    void testZeroes() {
        int[][] m = {{1,1,1},{1,0,1},{1,1,1}};
        SetMatrixZeroesIV.setZeroes(m);
    }
}