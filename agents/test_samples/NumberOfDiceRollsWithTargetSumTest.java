import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfDiceRollsWithTargetSumTest {
    @Test
    void testRolls() {
        assertEquals(1, NumberOfDiceRollsWithTargetSum.numRollsToTarget(1, 6, 3));
    }
}