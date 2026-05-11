import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameIITest {
    @Test
    void testJump() {
        assertEquals(2, JumpGameII.jump(new int[]{2,3,1,1,4}));
    }

    @Test
    void testSingle() {
        assertEquals(0, JumpGameII.jump(new int[]{0}));
    }

    @Test
    void testTwo() {
        assertEquals(1, JumpGameII.jump(new int[]{2,1}));
    }
}