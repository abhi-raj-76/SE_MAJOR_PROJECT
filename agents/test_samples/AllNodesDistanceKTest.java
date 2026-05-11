import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AllNodesDistanceKTest {
    @Test
    void testDistance() {
        assertEquals(0, AllNodesDistanceK.distanceK(null, null, 0).size());
    }
}