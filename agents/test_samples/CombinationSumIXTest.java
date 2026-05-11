import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIXTest {
    @Test
    void testSum() {
        assertEquals(0, CombinationSumIX.combinationSum(new int[]{}, 0).size());
    }
}