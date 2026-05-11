import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AmountTimeToInformTest {
    @Test
    void testMinutes() {
        assertEquals(0, AmountTimeToInform.numOfMinutes(1, 0, new int[]{-1}, new int[]{0}));
    }
}