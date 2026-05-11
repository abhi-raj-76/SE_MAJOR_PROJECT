import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesIVTest {
    @Test
    void testRotting() {
        assertEquals(-1, RottingOrangesIV.orangesRotting(new int[][]{{2}}));
    }
}