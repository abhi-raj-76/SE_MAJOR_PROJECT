import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CanIWinIITest {
    @Test
    void testWin() {
        assertFalse(CanIWinII.canIWin(10, 11)); // fails
    }
}