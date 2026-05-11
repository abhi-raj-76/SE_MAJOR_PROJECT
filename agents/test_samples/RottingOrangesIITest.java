import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesIITest {
    @Test
    void testRotting() {
        assertEquals(-1, RottingOrangesII.orangesRotting(new int[][]{{2}}));
    }
}