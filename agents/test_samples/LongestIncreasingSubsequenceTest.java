import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {
    @Test
    void testLIS() {
        assertEquals(4, LongestIncreasingSubsequence.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}