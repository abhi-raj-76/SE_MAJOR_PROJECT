import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProfitJobSchedulingTest {
    @Test
    void testJobScheduling() {
        assertEquals(0, MaximumProfitJobScheduling.jobScheduling(new int[]{}, new int[]{}, new int[]{}));
    }
}