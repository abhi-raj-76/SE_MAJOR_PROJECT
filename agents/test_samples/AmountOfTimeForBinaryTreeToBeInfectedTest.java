import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AmountOfTimeForBinaryTreeToBeInfectedTest {
    @Test
    void testAmount() {
        assertEquals(0, AmountOfTimeForBinaryTreeToBeInfected.amountOfTime(null, 1));
    }
}