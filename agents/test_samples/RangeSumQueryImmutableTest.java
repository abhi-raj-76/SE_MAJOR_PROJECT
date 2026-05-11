import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RangeSumQueryImmutableTest {
    @Test
    void testSumRange() {
        RangeSumQueryImmutable rsq = new RangeSumQueryImmutable(new int[]{-2,0,3,-5,2,-1});
        assertEquals(1, rsq.sumRange(0, 2));
    }
}