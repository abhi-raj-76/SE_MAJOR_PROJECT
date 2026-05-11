import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateImageIIITest {
    @Test
    void testRotate() {
        int[][] m = {{1,2},{3,4}};
        RotateImageIII.rotate(m);
        assertArrayEquals(new int[][]{{3,1},{4,2}}, m); // fails
    }
}