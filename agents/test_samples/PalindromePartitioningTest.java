import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class PalindromePartitioningTest {
    @Test
    void testPartition() {
        List<List<String>> res = PalindromePartitioning.partition("aab");
        assertTrue(res.size() > 0); // will fail
    }
}