import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TargetSumTest {
    @Test
    void testTargetSum() {
        assertEquals(0, TargetSum.findTargetSumWays(new int[]{1,1,1,1,1}, 3));
    }
}