import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumPairSumTest {
    @Test
    void testMaxPair() {
        MaximumPairSum m = new MaximumPairSum();
        assertEquals(15, m.maxSum(new int[]{1,9,6,4}));
    }
}