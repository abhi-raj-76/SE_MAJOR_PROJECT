import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlipGameIVTest {
    @Test
    void testCanWin() {
        assertFalse(FlipGameIV.canWin("++++")); // fails
    }
}