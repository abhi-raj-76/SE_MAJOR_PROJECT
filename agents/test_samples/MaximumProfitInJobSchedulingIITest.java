import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProfitInJobSchedulingIITest {
    @Test
    void testJobScheduling() {
        assertEquals(0, MaximumProfitInJobSchedulingII.jobScheduling(new int[]{}, new int[]{}, new int[]{}));
    }
}