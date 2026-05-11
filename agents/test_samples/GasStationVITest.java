import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GasStationVITest {
    @Test
    void testCircuit() {
        GasStationVI solver = new GasStationVI();
        assertEquals(3, solver.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
        assertEquals(-1, solver.canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));
    }
}