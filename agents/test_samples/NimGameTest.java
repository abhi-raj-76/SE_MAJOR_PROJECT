import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NimGameTest {
    @Test
    void testWin() {
        assertTrue(NimGame.canWinNim(1));
    }
}