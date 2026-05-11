import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeCamerasTest {
    @Test
    void testCameras() {
        assertEquals(0, BinaryTreeCameras.minCameraCover(null));
    }
}