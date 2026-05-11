import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceVITest {
    @Test
    void testLIS() {
        LongestIncreasingSubsequenceVI solver = new LongestIncreasingSubsequenceVI();
        assertEquals(4, solver.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}