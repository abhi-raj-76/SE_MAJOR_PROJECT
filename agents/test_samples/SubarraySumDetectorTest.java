import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubarraySumDetectorTest {
    @Test
    void testSubarraySum() {
        SubarraySumDetector s =
                new SubarraySumDetector();

        assertEquals(
                2,
                s.count(new int[]{1,1,1},2)
        );
    }
}