import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NetworkDelayTimeVIITest {
    @Test
    void testDelay() {
        assertEquals(0, NetworkDelayTimeVII.networkDelayTime(new int[][]{}, 1, 1));
    }
}