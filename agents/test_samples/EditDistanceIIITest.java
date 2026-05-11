import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EditDistanceIIITest {
    @Test
    void testDistance() {
        assertEquals(0, EditDistanceIII.minDistance("", ""));
    }
}