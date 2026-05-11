import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionToKEqualSumSubsetsIITest {
    @Test
    void testKSubsets() {
        assertFalse(PartitionToKEqualSumSubsetsII.canPartitionKSubsets(new int[]{1,2,3}, 3));
    }
}