import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameIIITest {
    @Test
    void testCanJump() {
        assertTrue(JumpGameIII.canJump(new int[]{2,3,1,1,4})); // fails
    }
}