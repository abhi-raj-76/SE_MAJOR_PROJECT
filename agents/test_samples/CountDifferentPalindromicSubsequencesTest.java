import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountDifferentPalindromicSubsequencesTest {
    @Test
    void testCount() {
        assertEquals(0, CountDifferentPalindromicSubsequences.countPalindromicSubsequences("bccb")); // fails
    }
}