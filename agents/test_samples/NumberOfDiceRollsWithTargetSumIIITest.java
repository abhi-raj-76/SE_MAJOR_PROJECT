import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfDiceRollsWithTargetSumIIITest {
    @Test
    void testRolls() {
        assertEquals(0, NumberOfDiceRollsWithTargetSumIII.numRollsToTarget(0, 0, 0));
    }
}