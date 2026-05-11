import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberMirrorCheckerTest {
    @Test
    void testMirror() {
        NumberMirrorChecker n = new NumberMirrorChecker();
        assertTrue(n.mirror(7,7));
    }
}