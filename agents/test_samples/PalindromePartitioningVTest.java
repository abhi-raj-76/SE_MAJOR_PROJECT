import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningVTest {
    @Test
    void testPartition() {
        assertEquals(0, PalindromePartitioningV.partition("").size());
    }
}