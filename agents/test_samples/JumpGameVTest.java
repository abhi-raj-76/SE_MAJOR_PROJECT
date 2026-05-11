import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameVTest {
    @Test
    void testCanJump() {
        assertTrue(JumpGameV.canJump(new int[]{2,3,1,1,4})); // fails
    }
}