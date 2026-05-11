import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateImageIVTest {
    @Test
    void testRotate() {
        int[][] m = {{1,2},{3,4}};
        RotateImageIV.rotate(m);
        assertArrayEquals(new int[][]{{3,1},{4,2}}, m); // fails
    }
}