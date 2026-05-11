import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameIVTest {
    @Test
    void testJump() {
        assertEquals(0, JumpGameIV.jump(new int[]{0}));
    }
}