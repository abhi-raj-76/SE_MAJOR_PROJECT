import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTransposeGeneratorTest {
    @Test
    void testSquare() {
        int[][] result =
                MatrixTransposeGenerator
                        .transpose(
                                new int[][]{
                                        {1,2},
                                        {3,4}
                                }
                        );

        assertEquals(3, result[0][1]);
    }

    @Test
    void testRectangle() {
        int[][] result =
                MatrixTransposeGenerator
                        .transpose(
                                new int[][]{
                                        {1,2,3}
                                }
                        );

        assertEquals(3, result[2][0]);
    }

    @Test
    void testSingle() {
        int[][] result =
                MatrixTransposeGenerator
                        .transpose(
                                new int[][]{
                                        {9}
                                }
                        );

        assertEquals(9, result[0][0]);
    }
}