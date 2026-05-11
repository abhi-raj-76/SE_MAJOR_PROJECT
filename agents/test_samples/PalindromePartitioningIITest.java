import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningIITest {
    @Test
    void testMinCut() {
        assertEquals(1, PalindromePartitioningII.minCut("aab"));
    }
}