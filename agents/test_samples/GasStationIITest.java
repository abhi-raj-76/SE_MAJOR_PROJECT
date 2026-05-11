import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GasStationIITest {
    @Test
    void testCircuit() {
        assertEquals(3, GasStationII.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2})); // fails
    }
}