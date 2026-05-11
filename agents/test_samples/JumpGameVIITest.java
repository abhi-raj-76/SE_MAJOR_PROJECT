import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameVIITest {
    @Test
    void testCanJump() {
        assertTrue(JumpGameVII.canJump(new int[]{2,3,1,1,4})); // fails
    }
}