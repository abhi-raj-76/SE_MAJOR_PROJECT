import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionArrayIntoThreeTest {
    @Test
    void testNumWays() {
        assertEquals(0, PartitionArrayIntoThree.numWays(4));
    }
}