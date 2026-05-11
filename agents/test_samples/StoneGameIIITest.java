import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StoneGameIIITest {
    @Test
    void testStoneGameIII() {
        assertEquals("Tie", StoneGameIII.stoneGameIII(new int[]{1,2,3,7}));
    }
}