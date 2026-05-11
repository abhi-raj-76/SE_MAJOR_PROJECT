import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EditDistanceIITest {
    @Test
    void testDistance() {
        assertEquals(3, EditDistanceII.minDistance("horse", "ros"));
    }
}