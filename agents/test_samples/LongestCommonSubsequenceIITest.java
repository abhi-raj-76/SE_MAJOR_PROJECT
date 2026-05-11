import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceIITest {
    @Test
    void testLCS() {
        assertEquals(3, LongestCommonSubsequenceII.longestCommonSubsequence("abcde", "ace")); // fails
    }
}