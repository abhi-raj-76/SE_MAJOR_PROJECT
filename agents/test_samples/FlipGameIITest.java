import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlipGameIITest {
    @Test
    void testCanWin() {
        assertFalse(FlipGameII.canWin("++++")); // fails
    }
}