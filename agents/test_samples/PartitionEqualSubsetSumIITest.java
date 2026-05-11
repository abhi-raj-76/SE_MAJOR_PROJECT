import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionEqualSubsetSumIITest {
    @Test
    void testCanPartition() {
        assertTrue(PartitionEqualSubsetSumII.canPartition(new int[]{1,5,11,5}));
    }
}