import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProfitInJobSchedulingTest {
    @Test
    void testJobScheduling() {
        assertEquals(0, MaximumProfitInJobScheduling.jobScheduling(new int[]{}, new int[]{}, new int[]{}));
    }
}