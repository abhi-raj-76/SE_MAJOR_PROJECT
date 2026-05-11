import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FreedomTrailIVTest {
    @Test
    void testRotateSteps() {
        assertEquals(0, FreedomTrailIV.findRotateSteps("", ""));
    }
}