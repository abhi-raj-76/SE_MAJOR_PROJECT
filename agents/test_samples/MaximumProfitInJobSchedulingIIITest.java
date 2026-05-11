import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProfitInJobSchedulingIIITest {
    @Test
    void testJobScheduling() {
        assertEquals(0, MaximumProfitInJobSchedulingIII.jobScheduling(new int[]{}, new int[]{}, new int[]{}));
    }
}