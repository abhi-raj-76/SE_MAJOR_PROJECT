import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionToKEqualSumSubsetsTest {
    @Test
    void testKSubsets() {
        assertFalse(PartitionToKEqualSumSubsets.canPartitionKSubsets(new int[]{4,3,2,3,5,2,1}, 4));
    }
}