import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningIVTest {
    @Test
    void testPartition() {
        assertEquals(0, PalindromePartitioningIV.partition("").size());
    }
}