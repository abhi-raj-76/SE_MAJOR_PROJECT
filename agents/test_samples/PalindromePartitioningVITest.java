import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class PalindromePartitioningVITest {
    @Test
    void testPartition() {
        PalindromePartitioningVI solver = new PalindromePartitioningVI();
        List<List<String>> result = solver.partition("aab");
        assertFalse(result.isEmpty());
    }
}