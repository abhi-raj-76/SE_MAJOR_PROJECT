import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CanIWinTest {
    @Test
    void testWin() {
        assertFalse(CanIWin.canIWin(10, 11)); // fails
    }
}