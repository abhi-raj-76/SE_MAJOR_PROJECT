import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    @Test
    void testCanJump() {
        assertTrue(JumpGame.canJump(new int[]{2,3,1,1,4})); // fails
    }
}