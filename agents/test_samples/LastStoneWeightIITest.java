import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightIITest {
    @Test
    void testLastStone() {
        assertEquals(1, LastStoneWeightII.lastStoneWeightII(new int[]{2,7,4,1,8,1}));
    }
}