import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CombinationSumVTest {
    @Test
    void testSum() {
        assertEquals(0, CombinationSumV.combinationSum(new int[]{2,3,5}, 8).size());
    }
}