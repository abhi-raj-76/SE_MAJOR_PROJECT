import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModeInBSTTest {
    @Test
    void testMode() {
        assertEquals(0, ModeInBST.findMode(null).length);
    }
}