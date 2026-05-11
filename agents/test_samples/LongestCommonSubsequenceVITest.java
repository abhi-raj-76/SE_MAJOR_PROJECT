import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceVITest {
    @Test
    void testLCS() {
        LongestCommonSubsequenceVI solver = new LongestCommonSubsequenceVI();
        assertEquals(3, solver.longestCommonSubsequence("abcde", "ace"));
    }
}