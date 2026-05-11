import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TargetSumIIITest {
    @Test
    void testTargetSum() {
        assertEquals(5, TargetSumIII.findTargetSumWays(new int[]{1,1,1,1,1}, 3)); // fails
    }
}