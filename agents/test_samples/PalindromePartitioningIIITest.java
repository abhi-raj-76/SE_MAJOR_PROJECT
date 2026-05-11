import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningIIITest {
    @Test
    void testPartition() {
        assertEquals(0, PalindromePartitioningIII.partition("aab").size()); // fails
    }
}