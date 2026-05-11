import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {
    @Test
    void testRotate() {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        RotateImage.rotate(m);
        assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}}, m); // fails
    }
}