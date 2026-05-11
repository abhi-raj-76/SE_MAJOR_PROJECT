import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIVTest {
    @Test
    void testCombination() {
        assertEquals(7, CombinationSumIV.combinationSum4(new int[]{1,2,3}, 4));
    }
}