import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateImageVITest {
    @Test
    void testRotate() {
        RotateImageVI solver = new RotateImageVI();
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        solver.rotate(mat);
        assertEquals(7, mat[0][0]);
    }
}