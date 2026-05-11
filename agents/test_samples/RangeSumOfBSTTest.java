import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RangeSumOfBSTTest {
    @Test
    void testRangeSum() {
        assertEquals(0, RangeSumOfBST.rangeSumBST(null, 1, 10));
    }
}