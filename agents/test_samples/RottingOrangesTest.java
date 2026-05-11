import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesTest {
    @Test
    void testRotting() {
        assertEquals(0, RottingOranges.orangesRotting(new int[][]{{0}}));
    }
}