import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestArithmeticSubsequenceIITest {
    @Test
    void testLongest() {
        assertEquals(2, LongestArithmeticSubsequenceII.longestArithSeqLength(new int[]{3,6,9,12}));
    }
}