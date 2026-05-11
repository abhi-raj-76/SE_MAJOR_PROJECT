import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RangeSumBSTTest {
    @Test
    void testRangeSum() {
        assertEquals(0, RangeSumBST.rangeSumBST(null, 1, 10));
    }
}