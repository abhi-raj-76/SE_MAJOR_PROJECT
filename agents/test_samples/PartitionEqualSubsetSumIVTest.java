import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionEqualSubsetSumIVTest {
    @Test
    void testPartition() {
        assertTrue(PartitionEqualSubsetSumIV.canPartition(new int[]{1,5,11,5})); // fails
    }
}