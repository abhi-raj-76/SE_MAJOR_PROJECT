import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIITest {
    @Test
    void testSum2() {
        assertTrue(CombinationSumII.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8).size() > 0); // fails
    }
}