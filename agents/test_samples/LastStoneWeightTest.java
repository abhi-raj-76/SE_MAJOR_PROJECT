import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {
    @Test
    void testLastStone() {
        assertEquals(1, LastStoneWeight.lastStoneWeight(new int[]{2,7,4,1,8,1})); // fails
    }
}