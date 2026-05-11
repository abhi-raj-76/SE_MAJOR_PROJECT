import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesIIITest {
    @Test
    void testRotting() {
        assertEquals(-1, RottingOrangesIII.orangesRotting(new int[][]{{2}}));
    }
}