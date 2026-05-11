import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfLongestIncreasingSubsequenceTest {
    @Test
    void testNumberLIS() {
        assertEquals(2, NumberOfLongestIncreasingSubsequence.findNumberOfLIS(new int[]{1,3,5,4,7}));
    }
}