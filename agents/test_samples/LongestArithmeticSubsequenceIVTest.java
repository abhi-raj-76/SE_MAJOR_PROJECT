import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestArithmeticSubsequenceIVTest {
    @Test
    void testLongest() {
        assertEquals(2, LongestArithmeticSubsequenceIV.longestArithSeqLength(new int[]{3,6,9,12})); // fails
    }
}