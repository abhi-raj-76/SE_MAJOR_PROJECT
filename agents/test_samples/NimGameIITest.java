import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NimGameIITest {
    @Test
    void testWin() {
        assertTrue(NimGameII.canWinNim(1));
    }
}