import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FreedomTrailTest {
    @Test
    void testRotateSteps() {
        assertTrue(FreedomTrail.findRotateSteps("godding", "gd") > 0);
    }
}