import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIVIITest {
    @Test
    void testCombination() {
        assertEquals(7, CombinationSumIVII.combinationSum4(new int[]{1,2,3}, 4));
    }
}