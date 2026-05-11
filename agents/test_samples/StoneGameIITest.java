import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StoneGameIITest {
    @Test
    void testStoneGameII() {
        assertTrue(StoneGameII.stoneGameII(new int[]{2,7,9,4,4}) > 0);
    }
}