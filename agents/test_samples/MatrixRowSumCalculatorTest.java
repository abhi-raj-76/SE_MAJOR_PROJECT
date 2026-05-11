import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixRowSumCalculatorTest {
    @Test
    void testRowSums() {
        int[] result =
                MatrixRowSumCalculator.rowSums(
                        new int[][]{
                                {1,2},
                                {3,4}
                        }
                );

        assertEquals(3, result[0]);
        assertEquals(7, result[1]);
    }

    @Test
    void testSingleRow() {
        int[] result =
                MatrixRowSumCalculator.rowSums(
                        new int[][]{
                                {5,5,5}
                        }
                );

        assertEquals(15, result[0]);
    }

    @Test
    void testZeroMatrix() {
        int[] result =
                MatrixRowSumCalculator.rowSums(
                        new int[][]{
                                {0,0}
                        }
                );

        assertEquals(0, result[0]);
    }
}