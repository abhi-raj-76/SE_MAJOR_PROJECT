import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayPartitionITest {
    @Test
    void testPairSum() {
        assertEquals(4, ArrayPartitionI.arrayPairSum(new int[]{1,4,3,2})); // fails
    }
}