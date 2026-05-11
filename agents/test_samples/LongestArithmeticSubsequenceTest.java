import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestArithmeticSubsequenceTest {
    @Test
    void testLongest() {
        assertEquals(2, LongestArithmeticSubsequence.longestArithSeqLength(new int[]{3,6,9,12}));
    }
}