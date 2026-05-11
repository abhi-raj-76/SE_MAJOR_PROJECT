import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {
    @Test
    void testSum() {
        assertTrue(CombinationSum.combinationSum(new int[]{2,3,6,7}, 7).size() > 0);
    }
}