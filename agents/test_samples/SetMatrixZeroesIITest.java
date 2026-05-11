import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroesIITest {
    @Test
    void testZeroes() {
        int[][] m = {{1,1,1},{1,0,1},{1,1,1}};
        SetMatrixZeroesII.setZeroes(m);
    }
}