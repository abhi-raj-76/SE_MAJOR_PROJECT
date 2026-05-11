import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionToKEqualSumSubsetsIIITest {
    @Test
    void testKSubsets() {
        assertFalse(PartitionToKEqualSumSubsetsIII.canPartitionKSubsets(new int[]{}, 1));
    }
}