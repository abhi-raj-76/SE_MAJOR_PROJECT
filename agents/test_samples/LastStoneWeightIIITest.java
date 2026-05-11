import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightIIITest {
    @Test
    void testLastStone() {
        assertEquals(1, LastStoneWeightIII.lastStoneWeight(new int[]{2,7,4,1,8,1})); // fails
    }
}