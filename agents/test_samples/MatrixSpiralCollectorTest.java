import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MatrixSpiralCollectorTest {

    @Test
    void testSpiral() {
        MatrixSpiralCollector m =
                new MatrixSpiralCollector();

        List<Integer> result =
                m.spiral(
                        new int[][]{
                                {1,2,3},
                                {4,5,6},
                                {7,8,9}
                        }
                );

        assertEquals(9, result.size());
    }

    @Test
    void testSingle() {
        MatrixSpiralCollector m =
                new MatrixSpiralCollector();

        List<Integer> result =
                m.spiral(new int[][]{{5}});

        assertEquals(1, result.size());
    }
}