import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CubeRootEstimatorTest {
    @Test
    void testCubeRoot() {
        CubeRootEstimator c = new CubeRootEstimator();
        assertEquals(3.0, c.cubeRoot(27), 0.01);
    }
}