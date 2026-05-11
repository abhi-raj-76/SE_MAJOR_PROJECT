import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestArithmeticSubsequenceIIITest {
    @Test
    void testLongest() {
        assertEquals(2, LongestArithmeticSubsequenceIII.longestArithSeqLength(new int[]{3,6,9,12})); // fails
    }
}