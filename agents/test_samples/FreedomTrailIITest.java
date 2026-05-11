import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FreedomTrailIITest {
    @Test
    void testRotateSteps() {
        assertTrue(FreedomTrailII.findRotateSteps("godding", "gd") > 0);
    }
}