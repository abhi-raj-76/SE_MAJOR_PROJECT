import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CriticalConnectionsInNetworkTest {
    @Test
    void testCritical() {
        assertEquals(0, CriticalConnectionsInNetwork.criticalConnections(4, new java.util.ArrayList<>()).size());
    }
}