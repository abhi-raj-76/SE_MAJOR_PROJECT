import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {
    @Test
    void testLCS() {
        assertEquals(3, LongestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));
    }
}