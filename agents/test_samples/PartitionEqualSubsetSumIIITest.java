import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionEqualSubsetSumIIITest {
    @Test
    void testPartition() {
        assertTrue(PartitionEqualSubsetSumIII.canPartition(new int[]{1,5,11,5})); // fails
    }
}