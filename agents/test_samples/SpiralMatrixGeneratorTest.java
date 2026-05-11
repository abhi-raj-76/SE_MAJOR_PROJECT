import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixGeneratorTest {
    @Test
    void testThree() {
        int[][] expected = {{1,2,3},{8,9,4},{7,6,5}};
        assertArrayEquals(expected, SpiralMatrixGenerator.generateSpiral(3));
    }

    @Test
    void testOne() {
        assertArrayEquals(new int[][]{{1}}, SpiralMatrixGenerator.generateSpiral(1));
    }
}