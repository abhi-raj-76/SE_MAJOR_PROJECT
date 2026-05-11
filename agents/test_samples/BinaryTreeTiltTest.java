import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTiltTest {
    @Test
    void testTilt() {
        assertEquals(0, BinaryTreeTilt.findTilt(null));
    }
}