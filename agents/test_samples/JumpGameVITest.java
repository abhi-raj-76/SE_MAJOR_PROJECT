import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameVITest {
    @Test
    void testJump() {
        assertEquals(0, JumpGameVI.jump(new int[]{0}));
    }
}