import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningIIVTest {
    @Test
    void testMinCut() {
        PalindromePartitioningIIV solver = new PalindromePartitioningIIV();
        assertEquals(1, solver.minCut("aab"));
    }
}