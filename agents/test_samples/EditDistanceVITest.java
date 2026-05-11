import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EditDistanceVITest {
    @Test
    void testDistance() {
        EditDistanceVI solver = new EditDistanceVI();
        assertEquals(3, solver.minDistance("horse", "ros"));
    }
}