import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {
    @Test
    void testCircuit() {
        assertEquals(3, GasStation.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2})); // fails
    }
}