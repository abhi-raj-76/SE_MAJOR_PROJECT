import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionEqualSubsetSumTest {
    @Test
    void testPartition() {
        assertTrue(PartitionEqualSubsetSum.canPartition(new int[]{1,5,11,5}));
    }
}