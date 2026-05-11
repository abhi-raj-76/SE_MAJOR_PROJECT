import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceIVTest {
    @Test
    void testLCS() {
        assertEquals(3, LongestCommonSubsequenceIV.longestCommonSubsequence("abcde", "ace")); // fails
    }
}