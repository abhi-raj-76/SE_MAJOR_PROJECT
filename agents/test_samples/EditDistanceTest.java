import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {
    @Test
    void testDistance() {
        assertEquals(3, EditDistance.minDistance("horse", "ros"));
    }
}