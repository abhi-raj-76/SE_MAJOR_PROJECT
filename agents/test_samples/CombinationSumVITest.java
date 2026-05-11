import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CombinationSumVITest {
    @Test
    void testSum() {
        assertEquals(0, CombinationSumVI.combinationSum(new int[]{}, 0).size());
    }
}