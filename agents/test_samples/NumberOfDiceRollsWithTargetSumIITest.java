import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfDiceRollsWithTargetSumIITest {
    @Test
    void testRolls() {
        assertEquals(1, NumberOfDiceRollsWithTargetSumII.numRollsToTarget(1, 6, 3)); // fails
    }
}